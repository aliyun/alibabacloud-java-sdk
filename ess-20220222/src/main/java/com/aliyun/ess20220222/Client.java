// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222;

import com.aliyun.tea.*;
import com.aliyun.ess20220222.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Ess";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
            new TeaPair("rus-west-1-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-nanjing", "ess.aliyuncs.com")
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
     * <b>description</b> :
     * <p>When you manage ECI scaling configurations by using YAML configuration files, take note of the following items:</p>
     * <ul>
     * <li>If you specify the ID of an ECI scaling configuration, the system updates the ECI scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not specify the ID of an ECI scaling configuration, the system creates an ECI scaling configuration based on the YAML configuration file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates an Elastic Container Instance (ECI) scaling configuration by using a configuration file.</p>
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
     * <b>description</b> :
     * <p>When you manage ECI scaling configurations by using YAML configuration files, take note of the following items:</p>
     * <ul>
     * <li>If you specify the ID of an ECI scaling configuration, the system updates the ECI scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not specify the ID of an ECI scaling configuration, the system creates an ECI scaling configuration based on the YAML configuration file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or updates an Elastic Container Instance (ECI) scaling configuration by using a configuration file.</p>
     * 
     * @param request ApplyEciScalingConfigurationRequest
     * @return ApplyEciScalingConfigurationResponse
     */
    public ApplyEciScalingConfigurationResponse applyEciScalingConfiguration(ApplyEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ApplyScalingGroup operation supports the Kubernetes Deployment resource definition format to quickly create Elastic Container Instance (ECI) scaling groups. It also supports ECI extended annotations for Kubernetes YAML. For more information, see the &quot;Supported annotations&quot; section.
     * Mapping between YAML configurations and scaling groups: A scaling group name is mapped by the namespace, kind, and name tuple in the YAML definition. In the same region, the same YAML configuration can only be mapped to the same scaling group. Example: If you use a Deployment YAML configuration with the name nginx in the default namespace, it is mapped to a scaling group named k8s_default_Deployment_nginx in the same region.
     * Logic for managing scaling groups based on YAML configurations:</p>
     * <ul>
     * <li>If the scaling group mapped to the YAML configuration exists, the scaling group is updated based on the YAML configuration.</li>
     * <li>If the scaling group mapped to the YAML configuration does not exist, a corresponding scaling group is created based on the YAML configuration.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ol>
     * <li>If the YAML configuration does not specify the VPC, vSwitch, and security group annotations, the system performs automatic creation of a default VPC, creates a default vSwitch in the VPC, and creates the default Auto Scaling security group ess-default-sg. By default, the security group policy allows traffic on TCP ports 22 and 3389, and the ICMP (IPv4) protocol. If you have other port and protocol requirements, you can modify the security group policy.</li>
     * <li>When you use a public image, you must enable public network access and configure the Settings for the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP).</li>
     * <li>After the ApplyScalingGroup operation applies the YAML configuration, the scaling group and scaling configuration take effect immediately. If replicas is set to a value greater than 0, automatic creation of resources is triggered.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>The annotations are referenced from <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum number of instances in the scaling group. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum number of instances in the scaling group. Default value: max(replicas, 30).</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The NTP server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The instance specifications, such as 2 vCPUs and 4 GiB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create a pod by using multiple instance types</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c****</td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to implement the multi-active zone feature.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv****</td>
     * <td>The ID of the security group. Requirements: <ul><li>You can specify one or more security groups. A maximum of five security groups can be specified.</li><li>The specified security groups must belong to the same VPC.</li><li>The specified security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>Specifies whether to shutdown log collection. A value of false indicates that log collection is shutdown. <p>When you collect logs by using Simple Log Service CRDs, if you do not need to collect logs for specific pods, you can configure this annotation to shutdown the log collection feature. This prevents the system from performing automatic creation of Logtail and wasting resources.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for the spot instance. Valid values: <ul><li>SpotWithPriceLimit: You use custom Settings for the maximum hourly price of the spot instance. In this case, you must set k8s.aliyun.com/eci-spot-price-limit.</li><li>SpotAsPriceGo: The system automatically places bids based on the actual price of the current marketplace.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price for the spot instance. The value is accurate to three decimal places. <p>This parameter takes effect only when the Settings of k8s.aliyun.com/eci-spot-strategy are SpotWithPriceLimit.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to perform automatic creation and attach an EIP. A value of true indicates that an EIP is automatically created and attached.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of DataCache. This parameter is required when you use DataCache to create a pod.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk created based on DataCache. <p>By default, an ESSD standard SSD is used, and the default PL is PL1.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read and write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}. Baseline performance = min{1800 + 50 × Capacity, 50000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The label string attached to the pod. You can attach up to three labels. Separate the label key and label value with a half-width colon character, and separate multiple labels with a half-width comma character.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates and manages a scaling group by using a configuration file.</p>
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
     * <b>description</b> :
     * <p>The ApplyScalingGroup operation supports the Kubernetes Deployment resource definition format to quickly create Elastic Container Instance (ECI) scaling groups. It also supports ECI extended annotations for Kubernetes YAML. For more information, see the &quot;Supported annotations&quot; section.
     * Mapping between YAML configurations and scaling groups: A scaling group name is mapped by the namespace, kind, and name tuple in the YAML definition. In the same region, the same YAML configuration can only be mapped to the same scaling group. Example: If you use a Deployment YAML configuration with the name nginx in the default namespace, it is mapped to a scaling group named k8s_default_Deployment_nginx in the same region.
     * Logic for managing scaling groups based on YAML configurations:</p>
     * <ul>
     * <li>If the scaling group mapped to the YAML configuration exists, the scaling group is updated based on the YAML configuration.</li>
     * <li>If the scaling group mapped to the YAML configuration does not exist, a corresponding scaling group is created based on the YAML configuration.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ol>
     * <li>If the YAML configuration does not specify the VPC, vSwitch, and security group annotations, the system performs automatic creation of a default VPC, creates a default vSwitch in the VPC, and creates the default Auto Scaling security group ess-default-sg. By default, the security group policy allows traffic on TCP ports 22 and 3389, and the ICMP (IPv4) protocol. If you have other port and protocol requirements, you can modify the security group policy.</li>
     * <li>When you use a public image, you must enable public network access and configure the Settings for the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP).</li>
     * <li>After the ApplyScalingGroup operation applies the YAML configuration, the scaling group and scaling configuration take effect immediately. If replicas is set to a value greater than 0, automatic creation of resources is triggered.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>The annotations are referenced from <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum number of instances in the scaling group. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum number of instances in the scaling group. Default value: max(replicas, 30).</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The NTP server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The instance specifications, such as 2 vCPUs and 4 GiB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create a pod by using multiple instance types</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c****</td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to implement the multi-active zone feature.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv****</td>
     * <td>The ID of the security group. Requirements: <ul><li>You can specify one or more security groups. A maximum of five security groups can be specified.</li><li>The specified security groups must belong to the same VPC.</li><li>The specified security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>Specifies whether to shutdown log collection. A value of false indicates that log collection is shutdown. <p>When you collect logs by using Simple Log Service CRDs, if you do not need to collect logs for specific pods, you can configure this annotation to shutdown the log collection feature. This prevents the system from performing automatic creation of Logtail and wasting resources.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for the spot instance. Valid values: <ul><li>SpotWithPriceLimit: You use custom Settings for the maximum hourly price of the spot instance. In this case, you must set k8s.aliyun.com/eci-spot-price-limit.</li><li>SpotAsPriceGo: The system automatically places bids based on the actual price of the current marketplace.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price for the spot instance. The value is accurate to three decimal places. <p>This parameter takes effect only when the Settings of k8s.aliyun.com/eci-spot-strategy are SpotWithPriceLimit.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to perform automatic creation and attach an EIP. A value of true indicates that an EIP is automatically created and attached.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of DataCache. This parameter is required when you use DataCache to create a pod.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk created based on DataCache. <p>By default, an ESSD standard SSD is used, and the default PL is PL1.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read and write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}. Baseline performance = min{1800 + 50 × Capacity, 50000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The label string attached to the pod. You can attach up to three labels. Separate the label key and label value with a half-width colon character, and separate multiple labels with a half-width comma character.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates and manages a scaling group by using a configuration file.</p>
     * 
     * @param request ApplyScalingGroupRequest
     * @return ApplyScalingGroupResponse
     */
    public ApplyScalingGroupResponse applyScalingGroup(ApplyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you add ALB server groups to a scaling group, the following conditions must be met:</p>
     * <ul>
     * <li>The network type of the scaling group must be VPC, and the scaling group must be in the same VPC as the ALB server groups.</li>
     * <li>The ALB server groups must be in the Available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more Application Load Balancer (ALB) server groups to a scaling group. This operation is applicable to scenarios where you need to dynamically adjust the number of instances to handle fluctuating workloads and ensure high availability of applications. It enables automatic elastic scaling during business fluctuations, dynamically distributes traffic based on loads, and improves application stability.</p>
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
     * <b>description</b> :
     * <p>When you add ALB server groups to a scaling group, the following conditions must be met:</p>
     * <ul>
     * <li>The network type of the scaling group must be VPC, and the scaling group must be in the same VPC as the ALB server groups.</li>
     * <li>The ALB server groups must be in the Available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more Application Load Balancer (ALB) server groups to a scaling group. This operation is applicable to scenarios where you need to dynamically adjust the number of instances to handle fluctuating workloads and ensure high availability of applications. It enables automatic elastic scaling during business fluctuations, dynamically distributes traffic based on loads, and improves application stability.</p>
     * 
     * @param request AttachAlbServerGroupsRequest
     * @return AttachAlbServerGroupsResponse
     */
    public AttachAlbServerGroupsResponse attachAlbServerGroups(AttachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAlbServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following conditions must be met when you attach RDS instances to a scaling group:</p>
     * <ul>
     * <li>The RDS instances and the scaling group must belong to the same account.</li>
     * <li>The RDS instances must not be locked. For more information about the locking policy, see <a href="https://help.aliyun.com/document_detail/41872.html">Usage notes for ApsaraDB RDS</a>.</li>
     * <li>The RDS instances must be in the Running state.</li>
     * <li>The RDS instances must be owned by your current account and must not be deleted.</li>
     * <li>If you attach an RDS instance that already exists in the scaling group to the scaling group again, the number of RDS instances in the scaling group does not change. However, the system attempts to add the private IP addresses of all ECS instances in the current scaling group to the IP address whitelist of the RDS instance.<blockquote>
     * <p>After you attach RDS instances, the default whitelist group of the RDS instances can contain a maximum of 1,000 IP addresses. For more information about IP address whitelists, see <a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP address whitelist</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches one or more RDS instances to a scaling group, which allows you to adjust the number of RDS instances in the scaling group at any time to increase flexibility and usability.</p>
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
     * <b>description</b> :
     * <p>The following conditions must be met when you attach RDS instances to a scaling group:</p>
     * <ul>
     * <li>The RDS instances and the scaling group must belong to the same account.</li>
     * <li>The RDS instances must not be locked. For more information about the locking policy, see <a href="https://help.aliyun.com/document_detail/41872.html">Usage notes for ApsaraDB RDS</a>.</li>
     * <li>The RDS instances must be in the Running state.</li>
     * <li>The RDS instances must be owned by your current account and must not be deleted.</li>
     * <li>If you attach an RDS instance that already exists in the scaling group to the scaling group again, the number of RDS instances in the scaling group does not change. However, the system attempts to add the private IP addresses of all ECS instances in the current scaling group to the IP address whitelist of the RDS instance.<blockquote>
     * <p>After you attach RDS instances, the default whitelist group of the RDS instances can contain a maximum of 1,000 IP addresses. For more information about IP address whitelists, see <a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP address whitelist</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches one or more RDS instances to a scaling group, which allows you to adjust the number of RDS instances in the scaling group at any time to increase flexibility and usability.</p>
     * 
     * @param request AttachDBInstancesRequest
     * @return AttachDBInstancesResponse
     */
    public AttachDBInstancesResponse attachDBInstances(AttachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDBInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on ECS instances or ECI instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances must not be added to other scaling groups.</li>
     * <li>The billing method of the instances must be subscription, pay-as-you-go, or spot instance.</li>
     * <li>If a vSwitch ID is specified for the scaling group, classic network-connected ECS instances or ECI instances, or ECS instances or ECI instances in other VPCs cannot be added to the scaling group.</li>
     * <li>If no vSwitch ID is specified for the scaling group, VPC-connected ECS instances or ECI instances cannot be added to the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on managed instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>Only managed instances that are not added to any scaling group can be added to an ECS scaling group.</li>
     * <li>Managed instances do not support lifecycle hooks, association with load balancing, or the health check feature.</li>
     * <li>After managed instances are added to an ECS scaling group, the scaling group does not manage the lifecycle of the managed instances.</li>
     * <li>Managed instances can only be manually added to or removed from the scaling group. Removed managed instances are not released.</li>
     * </ul>
     * </li>
     * <li>Precautions for using this operation:<ul>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and be executed directly.</li>
     * <li>A successful response only indicates that Auto Scaling accepted the request of the operation invocation and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must use the returned ScalingActivityId to check the execution status of the scaling activity.</li>
     * <li>If the sum of the number of instances specified in this operation and the current number of instances in the scaling group (Total Capacity) is greater than the maximum number of instances (MaxSize), the operation invocation fails.</li>
     * <li>ECS instances, ECI instances, or managed instances manually added by using this operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually adds instances to a scaling group. You can add ECS instances, Elastic Container Instance (ECI) instances, or managed instances outside the scaling group to the scaling group and put them into service. You can also restart ECS instances in the scaling group that are in the Economical Mode to the Running state and put them into service.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreInvalidInstance)) {
            query.put("IgnoreInvalidInstance", request.ignoreInvalidInstance);
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
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on ECS instances or ECI instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances must not be added to other scaling groups.</li>
     * <li>The billing method of the instances must be subscription, pay-as-you-go, or spot instance.</li>
     * <li>If a vSwitch ID is specified for the scaling group, classic network-connected ECS instances or ECI instances, or ECS instances or ECI instances in other VPCs cannot be added to the scaling group.</li>
     * <li>If no vSwitch ID is specified for the scaling group, VPC-connected ECS instances or ECI instances cannot be added to the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on managed instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>Only managed instances that are not added to any scaling group can be added to an ECS scaling group.</li>
     * <li>Managed instances do not support lifecycle hooks, association with load balancing, or the health check feature.</li>
     * <li>After managed instances are added to an ECS scaling group, the scaling group does not manage the lifecycle of the managed instances.</li>
     * <li>Managed instances can only be manually added to or removed from the scaling group. Removed managed instances are not released.</li>
     * </ul>
     * </li>
     * <li>Precautions for using this operation:<ul>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and be executed directly.</li>
     * <li>A successful response only indicates that Auto Scaling accepted the request of the operation invocation and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must use the returned ScalingActivityId to check the execution status of the scaling activity.</li>
     * <li>If the sum of the number of instances specified in this operation and the current number of instances in the scaling group (Total Capacity) is greater than the maximum number of instances (MaxSize), the operation invocation fails.</li>
     * <li>ECS instances, ECI instances, or managed instances manually added by using this operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually adds instances to a scaling group. You can add ECS instances, Elastic Container Instance (ECI) instances, or managed instances outside the scaling group to the scaling group and put them into service. You can also restart ECS instances in the scaling group that are in the Economical Mode to the Running state and put them into service.</p>
     * 
     * @param request AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following conditions must be met when adding load balancing instances to a scaling group:</p>
     * <ul>
     * <li>The load balancing instances and the scaling group must belong to the same account and region.</li>
     * <li>The load balancing instances must be in the <code>Running</code> state.</li>
     * <li>Each load balancing instance must be configured with at least one listener and have health checks enabled.</li>
     * <li>If the network type of both the load balancing instances and the scaling group is VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the load balancing instances is classic network, and the backend servers of the load balancing instances include VPC-connected instances, the VPC-connected instances must be in the same VPC as the scaling group.</li>
     * <li>The number of load balancing instances associated with the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates one or more load balancing instances with a scaling group to distribute access traffic to multiple instances in the scaling group and enhance the service capability of the scaling group. You can call the AttachLoadBalancers API operation to add one or more load balancing instances.</p>
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
     * <b>description</b> :
     * <p>The following conditions must be met when adding load balancing instances to a scaling group:</p>
     * <ul>
     * <li>The load balancing instances and the scaling group must belong to the same account and region.</li>
     * <li>The load balancing instances must be in the <code>Running</code> state.</li>
     * <li>Each load balancing instance must be configured with at least one listener and have health checks enabled.</li>
     * <li>If the network type of both the load balancing instances and the scaling group is VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the load balancing instances is classic network, and the backend servers of the load balancing instances include VPC-connected instances, the VPC-connected instances must be in the same VPC as the scaling group.</li>
     * <li>The number of load balancing instances associated with the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates one or more load balancing instances with a scaling group to distribute access traffic to multiple instances in the scaling group and enhance the service capability of the scaling group. You can call the AttachLoadBalancers API operation to add one or more load balancing instances.</p>
     * 
     * @param request AttachLoadBalancersRequest
     * @return AttachLoadBalancersResponse
     */
    public AttachLoadBalancersResponse attachLoadBalancers(AttachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLoadBalancersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the AttachServerGroups API to attach one or more load balancing server groups to a scaling group. This applies to scenarios that require dynamic instance scaling to handle fluctuating workloads and ensure application programs remain active with high availability. Supported server group types include Application Load Balancer (ALB), Network Load Balancer (NLB), and Gateway Load Balancer (GWLB). This enables automatic elastic extension, allows you to dynamically allocate traffic based on load conditions, and improves the stability of application programs.</p>
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
     * <b>summary</b> : 
     * <p>Invokes the AttachServerGroups API to attach one or more load balancing server groups to a scaling group. This applies to scenarios that require dynamic instance scaling to handle fluctuating workloads and ensure application programs remain active with high availability. Supported server group types include Application Load Balancer (ALB), Network Load Balancer (NLB), and Gateway Load Balancer (GWLB). This enables automatic elastic extension, allows you to dynamically allocate traffic based on load conditions, and improves the stability of application programs.</p>
     * 
     * @param request AttachServerGroupsRequest
     * @return AttachServerGroupsResponse
     */
    public AttachServerGroupsResponse attachServerGroups(AttachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To add vServer groups to a scaling group, the following conditions must be met:<ul>
     * <li>The CLB instance and the scaling group must belong to the same account.</li>
     * <li>The CLB instance and the scaling group must be in the same region.</li>
     * <li>The CLB instance must be in the Running state.</li>
     * <li>The CLB instance must be configured with at least one listener and health checks must be enabled.</li>
     * <li>If the network types of both the CLB instance and the scaling group are VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, and the vServer group contains VPC-connected instances, the instances must be in the same VPC as the scaling group.</li>
     * <li>The vServer groups to be added must belong to the corresponding CLB instance.</li>
     * <li>The number of vServer groups in the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * </li>
     * <li>When you add vServer groups to a scaling group, you must specify the following properties:<ul>
     * <li>CLB instance ID (LoadBalancerId)</li>
     * <li>vServer group ID (VServerGroupId)</li>
     * <li>vServer group port number (Port)<blockquote>
     * <p>If you add the same vServer group to a scaling group by using different port numbers, the system considers that multiple vServer groups are added to the scaling group. If both the vServer group ID and the port number in the request parameters are duplicated, the system uses the first configured group by default and ignores the other vServer groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more vServer groups of a Classic Load Balancer (CLB) instance to a scaling group. After a scaling group is associated with a CLB instance, instances added to the scaling group are automatically added as backend servers of the CLB instance to process access requests forwarded by the CLB instance. To forward different requests to different backend servers or forward requests based on domain names and URLs, you can call the AttachVServerGroups API operation to add one or more vServer groups of the CLB instance and manage different backend servers by using the vServer groups.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>To add vServer groups to a scaling group, the following conditions must be met:<ul>
     * <li>The CLB instance and the scaling group must belong to the same account.</li>
     * <li>The CLB instance and the scaling group must be in the same region.</li>
     * <li>The CLB instance must be in the Running state.</li>
     * <li>The CLB instance must be configured with at least one listener and health checks must be enabled.</li>
     * <li>If the network types of both the CLB instance and the scaling group are VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, and the vServer group contains VPC-connected instances, the instances must be in the same VPC as the scaling group.</li>
     * <li>The vServer groups to be added must belong to the corresponding CLB instance.</li>
     * <li>The number of vServer groups in the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * </li>
     * <li>When you add vServer groups to a scaling group, you must specify the following properties:<ul>
     * <li>CLB instance ID (LoadBalancerId)</li>
     * <li>vServer group ID (VServerGroupId)</li>
     * <li>vServer group port number (Port)<blockquote>
     * <p>If you add the same vServer group to a scaling group by using different port numbers, the system considers that multiple vServer groups are added to the scaling group. If both the vServer group ID and the port number in the request parameters are duplicated, the system uses the first configured group by default and ignores the other vServer groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more vServer groups of a Classic Load Balancer (CLB) instance to a scaling group. After a scaling group is associated with a CLB instance, instances added to the scaling group are automatically added as backend servers of the CLB instance to process access requests forwarded by the CLB instance. To forward different requests to different backend servers or forward requests based on domain names and URLs, you can call the AttachVServerGroups API operation to add one or more vServer groups of the CLB instance and manage different backend servers by using the vServer groups.</p>
     * 
     * @param request AttachVServerGroupsRequest
     * @return AttachVServerGroupsResponse
     */
    public AttachVServerGroupsResponse attachVServerGroups(AttachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot cancel an instance refresh task that is being rolled back.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels an instance refresh task and retains new instances that have been replaced and scaled out.</p>
     * 
     * @param request CancelInstanceRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelInstanceRefreshResponse
     */
    public CancelInstanceRefreshResponse cancelInstanceRefreshWithOptions(CancelInstanceRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskId)) {
            query.put("InstanceRefreshTaskId", request.instanceRefreshTaskId);
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
            new TeaPair("action", "CancelInstanceRefresh"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelInstanceRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot cancel an instance refresh task that is being rolled back.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels an instance refresh task and retains new instances that have been replaced and scaled out.</p>
     * 
     * @param request CancelInstanceRefreshRequest
     * @return CancelInstanceRefreshResponse
     */
    public CancelInstanceRefreshResponse cancelInstanceRefresh(CancelInstanceRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelInstanceRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the zone fault degradation for a scaling group.</p>
     * 
     * @param request CancelScalingGroupZoneShiftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelScalingGroupZoneShiftResponse
     */
    public CancelScalingGroupZoneShiftResponse cancelScalingGroupZoneShiftWithOptions(CancelScalingGroupZoneShiftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "CancelScalingGroupZoneShift"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelScalingGroupZoneShiftResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the zone fault degradation for a scaling group.</p>
     * 
     * @param request CancelScalingGroupZoneShiftRequest
     * @return CancelScalingGroupZoneShiftResponse
     */
    public CancelScalingGroupZoneShiftResponse cancelScalingGroupZoneShift(CancelScalingGroupZoneShiftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelScalingGroupZoneShiftWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A resource is a cloud service entity that you create in Alibaba Cloud. For example, a scaling group is a resource.</li>
     * <li>A resource group is a mechanism for grouping and managing resources within an Alibaba Cloud account. It helps you resolve the complexities of resource grouping and authorization management within a single cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which a scaling group belongs. Resource groups allow you to group your cloud resources, such as scaling groups, by purpose, permissions, and ownership to implement hierarchical resource management for multiple users and projects within an enterprise. You can call the ChangeResourceGroup operation to move a scaling group from one resource group to another. This allows you to centrally monitor and manage the scaling group in the new resource group, eliminating the need to check resources across multiple Alibaba Cloud services.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>A resource is a cloud service entity that you create in Alibaba Cloud. For example, a scaling group is a resource.</li>
     * <li>A resource group is a mechanism for grouping and managing resources within an Alibaba Cloud account. It helps you resolve the complexities of resource grouping and authorization management within a single cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which a scaling group belongs. Resource groups allow you to group your cloud resources, such as scaling groups, by purpose, permissions, and ownership to implement hierarchical resource management for multiple users and projects within an enterprise. You can call the ChangeResourceGroup operation to move a scaling group from one resource group to another. This allows you to centrally monitor and manage the scaling group in the new resource group, eliminating the need to check resources across multiple Alibaba Cloud services.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Allows you to specify the next action after the wait state ends: continue the scaling activity (CONTINUE), abandon the scaling activity (ABANDON), or perform a rollback (ROLLBACK).</p>
     * 
     * <b>summary</b> : 
     * <p>Ends the wait state of a scaling activity in advance to execute the next action if a lifecycle hook is configured for a scaling group.</p>
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
     * <b>description</b> :
     * <p>Allows you to specify the next action after the wait state ends: continue the scaling activity (CONTINUE), abandon the scaling activity (ABANDON), or perform a rollback (ROLLBACK).</p>
     * 
     * <b>summary</b> : 
     * <p>Ends the wait state of a scaling activity in advance to execute the next action if a lifecycle hook is configured for a scaling group.</p>
     * 
     * @param request CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     */
    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeLifecycleActionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom metric data to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimensions.DimensionKey and Dimensions.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS or ECI instances for a specific user in a specific scaling group.<ul>
     * <li>The metrics for custom monitoring event-triggered tasks (MetricType=custom) depend on your custom metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system, while device and state must be manually specified. For more information, see the Dimensions.DimensionKey and Dimensions.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>For workloads with bursty or unpredictable traffic patterns, call the CreateAlarm operation to create an event-triggered task. After the task is associated with CloudMonitor metrics, you can dynamically adjust the number of ECS or ECI instances in a scaling group and monitor instance metrics in real time to help you better manage and maintain cloud resources.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom metric data to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimensions.DimensionKey and Dimensions.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS or ECI instances for a specific user in a specific scaling group.<ul>
     * <li>The metrics for custom monitoring event-triggered tasks (MetricType=custom) depend on your custom metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system, while device and state must be manually specified. For more information, see the Dimensions.DimensionKey and Dimensions.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>For workloads with bursty or unpredictable traffic patterns, call the CreateAlarm operation to create an event-triggered task. After the task is associated with CloudMonitor metrics, you can dynamically adjust the number of ECS or ECI instances in a scaling group and monitor instance metrics in real time to help you better manage and maintain cloud resources.</p>
     * 
     * @param request CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostic report.</p>
     * 
     * @param request CreateDiagnoseReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnoseReportResponse
     */
    public CreateDiagnoseReportResponse createDiagnoseReportWithOptions(CreateDiagnoseReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnoseReport"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnoseReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a diagnostic report.</p>
     * 
     * @param request CreateDiagnoseReportRequest
     * @return CreateDiagnoseReportResponse
     */
    public CreateDiagnoseReportResponse createDiagnoseReport(CreateDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnoseReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The scaling configuration specifies the template for ECI instances used during scale-out activities.
     * The Cpu and Memory parameters specify the range of vCPUs and memory to define the instance type. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates the most cost-effective instance based on price sorting. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Elastic Container Instance (ECI) scaling configuration. Auto Scaling uses this scaling configuration as a template for ECI instances and performs automatic creation of ECI instances to meet your business needs when a scale-out activity is triggered.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            query.put("GpuDriverVersion", request.gpuDriverVersion);
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
     * <b>description</b> :
     * <p>The scaling configuration specifies the template for ECI instances used during scale-out activities.
     * The Cpu and Memory parameters specify the range of vCPUs and memory to define the instance type. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates the most cost-effective instance based on price sorting. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Elastic Container Instance (ECI) scaling configuration. Auto Scaling uses this scaling configuration as a template for ECI instances and performs automatic creation of ECI instances to meet your business needs when a scale-out activity is triggered.</p>
     * 
     * @param request CreateEciScalingConfigurationRequest
     * @return CreateEciScalingConfigurationResponse
     */
    public CreateEciScalingConfigurationResponse createEciScalingConfiguration(CreateEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 10 lifecycle hooks in a scaling group. When a scaling activity occurs in a scaling group that has lifecycle hooks, the lifecycle hooks suspend the scaling activity for a period of time. You can specify the wait time by using the HeartbeatTimeout parameter. During the wait time, you can perform operations such as initializing the configurations of ECS instances and obtaining ECS instance data.
     * During a scale-out activity, ECS instances enter the wait state after they are added to the whitelist of an ApsaraDB RDS instance, and are added to the backend server group of a Server Load Balancer (SLB) instance after the wait state ends. During a scale-in activity, ECS instances enter the wait state after they are removed from the backend server group of the SLB instance, and are removed from the whitelist of the ApsaraDB RDS instance after the wait state ends.
     * You can configure notification methods for lifecycle hooks. Supported notification methods include Message Service (MNS) topics, MNS queues, and Operation Orchestration Service (OOS) templates. If you configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If the scaling group contains existing ECS instances and the configured OOS template is used to add or remove instances from the whitelist of a cloud database other than ApsaraDB RDS, you must manually add the existing ECS instances to the whitelist of the cloud database.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The CreateLifecycleHook API creates one or more lifecycle hooks in a specified scaling group. These hooks intervene at critical stages of the instance lifecycle, such as before startup or termination, and allow you to perform custom operations, such as sending notifications or executing automation scripts. This feature enables finer-grained control and management. For example, you can perform validation, configuration, or data backup tasks before and after instances are affected by scaling activities, which enhances the flexibility and reliability of application deployments.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionSources)) {
            query.put("LifecycleActionSources", request.lifecycleActionSources);
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
     * <b>description</b> :
     * <p>You can create up to 10 lifecycle hooks in a scaling group. When a scaling activity occurs in a scaling group that has lifecycle hooks, the lifecycle hooks suspend the scaling activity for a period of time. You can specify the wait time by using the HeartbeatTimeout parameter. During the wait time, you can perform operations such as initializing the configurations of ECS instances and obtaining ECS instance data.
     * During a scale-out activity, ECS instances enter the wait state after they are added to the whitelist of an ApsaraDB RDS instance, and are added to the backend server group of a Server Load Balancer (SLB) instance after the wait state ends. During a scale-in activity, ECS instances enter the wait state after they are removed from the backend server group of the SLB instance, and are removed from the whitelist of the ApsaraDB RDS instance after the wait state ends.
     * You can configure notification methods for lifecycle hooks. Supported notification methods include Message Service (MNS) topics, MNS queues, and Operation Orchestration Service (OOS) templates. If you configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If the scaling group contains existing ECS instances and the configured OOS template is used to add or remove instances from the whitelist of a cloud database other than ApsaraDB RDS, you must manually add the existing ECS instances to the whitelist of the cloud database.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The CreateLifecycleHook API creates one or more lifecycle hooks in a specified scaling group. These hooks intervene at critical stages of the instance lifecycle, such as before startup or termination, and allow you to perform custom operations, such as sending notifications or executing automation scripts. This feature enables finer-grained control and management. For example, you can perform validation, configuration, or data backup tasks before and after instances are affected by scaling activities, which enhances the flexibility and reliability of application deployments.</p>
     * 
     * @param request CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     */
    public CreateLifecycleHookResponse createLifecycleHook(CreateLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleHookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can configure the notification Settings to receive messages from cloud monitoring system events, Simple Message Queue (formerly MNS) queues, or Simple Message Queue (formerly MNS) topics. When a scaling event or resource change of a specified type occurs in a scaling group, Auto Scaling notifies cloud monitoring or Simple Message Queue (formerly MNS).</li>
     * <li>Different event notifications within the same scaling group cannot use the same destination.
     * For example, different event notifications cannot use the same cloud monitoring system event, the same MNS topic, or the same MNS queue at the same time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a notification configuration for Auto Scaling events and resource changes to help you track scaling group dynamics and automate the management of Auto Scaling events.</p>
     * 
     * @param request CreateNotificationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfigurationWithOptions(CreateNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageEncoding)) {
            query.put("MessageEncoding", request.messageEncoding);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
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
     * <b>description</b> :
     * <ul>
     * <li>You can configure the notification Settings to receive messages from cloud monitoring system events, Simple Message Queue (formerly MNS) queues, or Simple Message Queue (formerly MNS) topics. When a scaling event or resource change of a specified type occurs in a scaling group, Auto Scaling notifies cloud monitoring or Simple Message Queue (formerly MNS).</li>
     * <li>Different event notifications within the same scaling group cannot use the same destination.
     * For example, different event notifications cannot use the same cloud monitoring system event, the same MNS topic, or the same MNS queue at the same time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a notification configuration for Auto Scaling events and resource changes to help you track scaling group dynamics and automate the management of Auto Scaling events.</p>
     * 
     * @param request CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfiguration(CreateNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A scaling configuration specifies the ECS instance template used during scale-out. The following instance configuration methods are supported:</p>
     * <ul>
     * <li>InstancePatternInfos: the intelligent configuration mode. You do not need to specify exact network types. You only need to specify the number of vCPUs, memory size, instance family level, and maximum price based on your business requirements. The system automatically filters network types that meet the requirements and preferentially selects the network type with the lowest price to create ECS instances. This mode applies only to scaling groups in a VPC and effectively reduces the chance of insufficient network type inventory during scale-out.</li>
     * <li>InstanceType: specifies a single instance type.</li>
     * <li>InstanceTypes: specifies multiple instance types.</li>
     * <li>InstanceTypeOverrides: specifies multiple instance types and configures weights for different instance types.</li>
     * <li>Cpu and Memory: specifies the range of instance types by defining the number of vCPUs and memory size. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates instances with the lowest price. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</li>
     * <li>You can use one of the following methods to bind the primary ENI. Note that you can use only one method to configure the primary ENI in a single call. Using both methods at the same time causes the call to fail and returns an error message.<ul>
     * <li>Directly set the configuration information of the primary ENI by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Set the configuration information of the primary ENI and secondary ENIs by using NetworkInterfaces. When you use the NetworkInterface parameter, you must set the primary ENI information. If NetworkInterface.InstanceType is set to Primary, it indicates the primary ENI. If NetworkInterface.InstanceType is set to Secondary or left empty, it indicates a secondary ENI.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. However, you can specify InstanceType or InstanceTypes together with InstancePatternInfos. When InstanceType or InstanceTypes is specified together with InstancePatternInfos, Auto Scaling preferentially uses the specified instance types for scale-out. If the specified instance types are out of stock, Auto Scaling uses the instance types that match the InstancePatternInfos configuration.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an ECS scaling configuration for a scaling group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.httpEndpoint)) {
            query.put("HttpEndpoint", request.httpEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpTokens)) {
            query.put("HttpTokens", request.httpTokens);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeCandidateOptions)) {
            query.put("InstanceTypeCandidateOptions", request.instanceTypeCandidateOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePoolOptions)) {
            query.put("ResourcePoolOptions", request.resourcePoolOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryEniVSwitchConstraint)) {
            query.put("SecondaryEniVSwitchConstraint", request.secondaryEniVSwitchConstraint);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityOptions)) {
            query.put("SecurityOptions", request.securityOptions);
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
     * <b>description</b> :
     * <p>A scaling configuration specifies the ECS instance template used during scale-out. The following instance configuration methods are supported:</p>
     * <ul>
     * <li>InstancePatternInfos: the intelligent configuration mode. You do not need to specify exact network types. You only need to specify the number of vCPUs, memory size, instance family level, and maximum price based on your business requirements. The system automatically filters network types that meet the requirements and preferentially selects the network type with the lowest price to create ECS instances. This mode applies only to scaling groups in a VPC and effectively reduces the chance of insufficient network type inventory during scale-out.</li>
     * <li>InstanceType: specifies a single instance type.</li>
     * <li>InstanceTypes: specifies multiple instance types.</li>
     * <li>InstanceTypeOverrides: specifies multiple instance types and configures weights for different instance types.</li>
     * <li>Cpu and Memory: specifies the range of instance types by defining the number of vCPUs and memory size. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates instances with the lowest price. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</li>
     * <li>You can use one of the following methods to bind the primary ENI. Note that you can use only one method to configure the primary ENI in a single call. Using both methods at the same time causes the call to fail and returns an error message.<ul>
     * <li>Directly set the configuration information of the primary ENI by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Set the configuration information of the primary ENI and secondary ENIs by using NetworkInterfaces. When you use the NetworkInterface parameter, you must set the primary ENI information. If NetworkInterface.InstanceType is set to Primary, it indicates the primary ENI. If NetworkInterface.InstanceType is set to Secondary or left empty, it indicates a secondary ENI.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. However, you can specify InstanceType or InstanceTypes together with InstancePatternInfos. When InstanceType or InstanceTypes is specified together with InstancePatternInfos, Auto Scaling preferentially uses the specified instance types for scale-out. If the specified instance types are out of stock, Auto Scaling uses the instance types that match the InstancePatternInfos configuration.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an ECS scaling configuration for a scaling group.</p>
     * 
     * @param request CreateScalingConfigurationRequest
     * @return CreateScalingConfigurationResponse
     */
    public CreateScalingConfigurationResponse createScalingConfiguration(CreateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A scaling group is a collection of ECS instances that share the same application scenarios.
     * The number of scaling groups that you can create in a region depends on your Auto Scaling usage. Go to Quota Center to check the quota for the total number of scaling groups.
     * A scaling group does not take effect immediately after it is created. You must invoke the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable the scaling group before it can trigger scaling activities and execute scaling rules.
     * The scaling group, the associated Classic Load Balancer (CLB) instances, and the associated ApsaraDB RDS instances must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you associate CLB instances with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group to the backend server groups of the CLB instances. You can specify the server groups to which the ECS instances are added. The following types of server groups are supported:</p>
     * <ul>
     * <li>Default server group: contains ECS instances that accept frontend requests. If a listener is not configured with a virtual server group or a primary/secondary server group, requests are forwarded to the ECS instances in the default server group by default.</li>
     * <li>Virtual server group: used when you need to forward different requests to different backend servers, or forward requests based on domain names and URLs.<blockquote>
     * <p>If you specify both the default server group and multiple virtual server groups, the ECS instances are added to all these server groups.
     * After an instance is added to a backend server group of a CLB instance, the default weight of the instance is 50. The CLB instance must meet the following conditions:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance must be in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to check the status of the CLB instance.</li>
     * <li>Health checks must be enabled for all listeners configured on the CLB instance. Otherwise, the scaling group fails to be created.
     * If you associate Application Load Balancer (ALB) server groups, Network Load Balancer (NLB) server groups, or Gateway Load Balancer (GWLB) server groups with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group as backend servers to the ALB, NLB, or GWLB server groups to process access requests distributed by the ALB, NLB, or GWLB instances. You can specify multiple ALB, NLB, or GWLB server groups, but the server groups must belong to the same VPC as the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600535.html">AttachServerGroups</a>.
     * If you associate ApsaraDB RDS instances with the scaling group, Auto Scaling automatically adds the internal IP addresses of the ECS instances in the scaling group to the whitelists of the ApsaraDB RDS instances. The ApsaraDB RDS instances must meet the following conditions:</li>
     * <li>The ApsaraDB RDS instance must be in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to check the status of the ApsaraDB RDS instance.</li>
     * <li>The number of IP addresses in the whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a> in the ApsaraDB RDS documentation.
     * If the MultiAZPolicy parameter of the scaling group is set to COST_OPTIMIZED:</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters are specified, the instance allocation method under the cost optimization policy is specified. This allocation method is prioritized during scale-out and scale-in.</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter is not specified, instances are created based on the lowest cost under the cost optimization policy. In this mode, you cannot create instances by using elasticity assurances or capacity reservations, and you cannot specify the vSwitch to which secondary elastic network interfaces (ENIs) belong.
     * If you configure propagatable tags for the scaling group, which means <code>Tags.Propagate</code> is set to true:</li>
     * <li>Tags on the scaling group are propagated only to newly created instances, not to existing instances in the scaling group.</li>
     * <li>If you specify instance tags in the scaling configuration and choose to propagate the tags of the scaling group to the instances, all tags coexist.</li>
     * <li>If a tag in the scaling configuration and a propagatable tag in the scaling group have the same tag key, the tag value in the scaling configuration takes precedence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling group to automatically adjust your computing capacity by adding or removing instances based on business demands and policies.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.autoRebalance)) {
            query.put("AutoRebalance", request.autoRebalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceMode)) {
            query.put("BalanceMode", request.balanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacityOptions)) {
            query.put("CapacityOptions", request.capacityOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopInstanceTimeout)) {
            query.put("StopInstanceTimeout", request.stopInstanceTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.zoneShiftPolicy)) {
            query.put("ZoneShiftPolicy", request.zoneShiftPolicy);
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
     * <b>description</b> :
     * <p>A scaling group is a collection of ECS instances that share the same application scenarios.
     * The number of scaling groups that you can create in a region depends on your Auto Scaling usage. Go to Quota Center to check the quota for the total number of scaling groups.
     * A scaling group does not take effect immediately after it is created. You must invoke the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable the scaling group before it can trigger scaling activities and execute scaling rules.
     * The scaling group, the associated Classic Load Balancer (CLB) instances, and the associated ApsaraDB RDS instances must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you associate CLB instances with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group to the backend server groups of the CLB instances. You can specify the server groups to which the ECS instances are added. The following types of server groups are supported:</p>
     * <ul>
     * <li>Default server group: contains ECS instances that accept frontend requests. If a listener is not configured with a virtual server group or a primary/secondary server group, requests are forwarded to the ECS instances in the default server group by default.</li>
     * <li>Virtual server group: used when you need to forward different requests to different backend servers, or forward requests based on domain names and URLs.<blockquote>
     * <p>If you specify both the default server group and multiple virtual server groups, the ECS instances are added to all these server groups.
     * After an instance is added to a backend server group of a CLB instance, the default weight of the instance is 50. The CLB instance must meet the following conditions:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance must be in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to check the status of the CLB instance.</li>
     * <li>Health checks must be enabled for all listeners configured on the CLB instance. Otherwise, the scaling group fails to be created.
     * If you associate Application Load Balancer (ALB) server groups, Network Load Balancer (NLB) server groups, or Gateway Load Balancer (GWLB) server groups with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group as backend servers to the ALB, NLB, or GWLB server groups to process access requests distributed by the ALB, NLB, or GWLB instances. You can specify multiple ALB, NLB, or GWLB server groups, but the server groups must belong to the same VPC as the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600535.html">AttachServerGroups</a>.
     * If you associate ApsaraDB RDS instances with the scaling group, Auto Scaling automatically adds the internal IP addresses of the ECS instances in the scaling group to the whitelists of the ApsaraDB RDS instances. The ApsaraDB RDS instances must meet the following conditions:</li>
     * <li>The ApsaraDB RDS instance must be in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to check the status of the ApsaraDB RDS instance.</li>
     * <li>The number of IP addresses in the whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a> in the ApsaraDB RDS documentation.
     * If the MultiAZPolicy parameter of the scaling group is set to COST_OPTIMIZED:</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters are specified, the instance allocation method under the cost optimization policy is specified. This allocation method is prioritized during scale-out and scale-in.</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter is not specified, instances are created based on the lowest cost under the cost optimization policy. In this mode, you cannot create instances by using elasticity assurances or capacity reservations, and you cannot specify the vSwitch to which secondary elastic network interfaces (ENIs) belong.
     * If you configure propagatable tags for the scaling group, which means <code>Tags.Propagate</code> is set to true:</li>
     * <li>Tags on the scaling group are propagated only to newly created instances, not to existing instances in the scaling group.</li>
     * <li>If you specify instance tags in the scaling configuration and choose to propagate the tags of the scaling group to the instances, all tags coexist.</li>
     * <li>If a tag in the scaling configuration and a propagatable tag in the scaling group have the same tag key, the tag value in the scaling configuration takes precedence.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling group to automatically adjust your computing capacity by adding or removing instances based on business demands and policies.</p>
     * 
     * @param request CreateScalingGroupRequest
     * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A scaling rule defines specific scale-out or scale-in operations, such as adding or removing N instances. If executing a scaling rule causes the number of ECS or ECI instances in the scaling group to fall below MinSize or exceed MaxSize, Auto Scaling automatically adjusts the number of ECS or ECI instances to be added or removed so that the total number of instances reaches MinSize or MaxSize. However, the configured value of the scaling rule remains unchanged. Examples:</p>
     * <ul>
     * <li>For a scaling group with MaxSize set to 3 and a current total capacity of 2, if the scaling rule specifies adding 3 ECS instances, only 1 ECS instance is added during actual execution, but the configured value of the scaling rule remains 3.</li>
     * <li>For a scaling group with MinSize set to 2 and a current total capacity of 3, if the scaling rule specifies removing 5 ECS instances, only 1 ECS instance is removed during actual execution, but the configured value of the scaling rule remains 5.
     * Note the following parameter descriptions:</li>
     * <li>If AdjustmentType is set to TotalCapacity, the number of ECS or ECI instances in the scaling group is adjusted to the specified number. The corresponding AdjustmentValue must be greater than or equal to 0.</li>
     * <li>If AdjustmentType is set to QuantityChangeInCapacity or PercentChangeInCapacity, a positive AdjustmentValue indicates to increase instances, and a negative value indicates to decrease instances.</li>
     * <li>If AdjustmentType is set to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or ECI instances to be added or removed by using the formula: Current total capacity × AdjustmentValue / 100, and uses the rounding principle to confirm the number of ECS instances or ECI instances to increase or decrease.</li>
     * <li>If a cooldown time (Cooldown) is specified for the scaling rule, the scaling group enters the cooldown state for the specified duration after the scaling activity triggered by the rule is completed. If no cooldown time is specified for the scaling rule, the default cooldown time (DefaultCooldown) of the scaling group is used.</li>
     * <li>The number of scaling rules that can be created in a scaling group is limited. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The returned unique identifier of the scaling rule (ScalingRuleAri) can be used in the following API operations:<ul>
     * <li>Specify it in the ScalingRuleAri parameter of the ExecuteScalingRule operation to manually execute the scaling rule.</li>
     * <li>Specify it in the ScheduledAction parameter of the CreateScheduledTask operation to execute the scaling rule on a schedule.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling rule. The purpose of a scaling rule is determined by its type and can be used to trigger a scaling activity or intelligently configure the boundary values of a scaling group. You can create different types of scaling rules based on your business requirements. For example, if you only need to configure the boundary values of a scaling group, select the predictive scaling rule type.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.alarmOptions)) {
            query.put("AlarmOptions", request.alarmOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.hybridMetrics)) {
            query.put("HybridMetrics", request.hybridMetrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridMonitorNamespace)) {
            query.put("HybridMonitorNamespace", request.hybridMonitorNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
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
     * <b>description</b> :
     * <p>A scaling rule defines specific scale-out or scale-in operations, such as adding or removing N instances. If executing a scaling rule causes the number of ECS or ECI instances in the scaling group to fall below MinSize or exceed MaxSize, Auto Scaling automatically adjusts the number of ECS or ECI instances to be added or removed so that the total number of instances reaches MinSize or MaxSize. However, the configured value of the scaling rule remains unchanged. Examples:</p>
     * <ul>
     * <li>For a scaling group with MaxSize set to 3 and a current total capacity of 2, if the scaling rule specifies adding 3 ECS instances, only 1 ECS instance is added during actual execution, but the configured value of the scaling rule remains 3.</li>
     * <li>For a scaling group with MinSize set to 2 and a current total capacity of 3, if the scaling rule specifies removing 5 ECS instances, only 1 ECS instance is removed during actual execution, but the configured value of the scaling rule remains 5.
     * Note the following parameter descriptions:</li>
     * <li>If AdjustmentType is set to TotalCapacity, the number of ECS or ECI instances in the scaling group is adjusted to the specified number. The corresponding AdjustmentValue must be greater than or equal to 0.</li>
     * <li>If AdjustmentType is set to QuantityChangeInCapacity or PercentChangeInCapacity, a positive AdjustmentValue indicates to increase instances, and a negative value indicates to decrease instances.</li>
     * <li>If AdjustmentType is set to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or ECI instances to be added or removed by using the formula: Current total capacity × AdjustmentValue / 100, and uses the rounding principle to confirm the number of ECS instances or ECI instances to increase or decrease.</li>
     * <li>If a cooldown time (Cooldown) is specified for the scaling rule, the scaling group enters the cooldown state for the specified duration after the scaling activity triggered by the rule is completed. If no cooldown time is specified for the scaling rule, the default cooldown time (DefaultCooldown) of the scaling group is used.</li>
     * <li>The number of scaling rules that can be created in a scaling group is limited. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The returned unique identifier of the scaling rule (ScalingRuleAri) can be used in the following API operations:<ul>
     * <li>Specify it in the ScalingRuleAri parameter of the ExecuteScalingRule operation to manually execute the scaling rule.</li>
     * <li>Specify it in the ScheduledAction parameter of the CreateScheduledTask operation to execute the scaling rule on a schedule.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling rule. The purpose of a scaling rule is determined by its type and can be used to trigger a scaling activity or intelligently configure the boundary values of a scaling group. You can create different types of scaling rules based on your business requirements. For example, if you only need to configure the boundary values of a scaling group, select the predictive scaling rule type.</p>
     * 
     * @param request CreateScalingRuleRequest
     * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If a scheduled node has failed to trigger the execution of the scaling rule because a scaling activity is in progress or the scaling group is disabled, the scheduled node automatically retries within the <code>LaunchExpirationTime</code> period. Otherwise, the scheduled trigger is canceled.</li>
     * <li>If multiple scheduled nodes trigger scaling rules for the same scaling group at approximately the same time, the details of the triggered scaling activities are as follows:<ul>
     * <li><strong>Scaling groups with Settings for the expected number of instances</strong>: Scaling activities triggered by multiple scheduled nodes are of the parallel scaling activity type. For example, if multiple scheduled nodes are executed at approximately the same time, the scaling group can trigger multiple parallel scaling activity executions simultaneously.</li>
     * <li><strong>Scaling groups without Settings for the expected number of instances</strong>: The earliest triggered scheduled node executes the scaling activity first. Because a scaling group can run only one scaling activity at a time, subsequent scheduled nodes automatically retry within the <code>LaunchExpirationTime</code> period. If a subsequent scheduled node is still retrying within the <code>LaunchExpirationTime</code> period after the previous scaling activity is completed, the scaling rule of the scheduled node is executed and the corresponding scaling activity is triggered.</li>
     * </ul>
     * </li>
     * <li>Scheduled nodes support the following two scaling methods:<ul>
     * <li>Specify the scaling rule to be executed by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task. A scheduled task is a preset node. You can invoke the CreateScheduledTask API to create a scheduled task that executes a specified scaling rule at a specified time to automatically scale the compute resource, meeting business requirements while controlling costs.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.warmPoolCapacityOptions)) {
            query.put("WarmPoolCapacityOptions", request.warmPoolCapacityOptions);
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
     * <b>description</b> :
     * <ul>
     * <li>If a scheduled node has failed to trigger the execution of the scaling rule because a scaling activity is in progress or the scaling group is disabled, the scheduled node automatically retries within the <code>LaunchExpirationTime</code> period. Otherwise, the scheduled trigger is canceled.</li>
     * <li>If multiple scheduled nodes trigger scaling rules for the same scaling group at approximately the same time, the details of the triggered scaling activities are as follows:<ul>
     * <li><strong>Scaling groups with Settings for the expected number of instances</strong>: Scaling activities triggered by multiple scheduled nodes are of the parallel scaling activity type. For example, if multiple scheduled nodes are executed at approximately the same time, the scaling group can trigger multiple parallel scaling activity executions simultaneously.</li>
     * <li><strong>Scaling groups without Settings for the expected number of instances</strong>: The earliest triggered scheduled node executes the scaling activity first. Because a scaling group can run only one scaling activity at a time, subsequent scheduled nodes automatically retry within the <code>LaunchExpirationTime</code> period. If a subsequent scheduled node is still retrying within the <code>LaunchExpirationTime</code> period after the previous scaling activity is completed, the scaling rule of the scheduled node is executed and the corresponding scaling activity is triggered.</li>
     * </ul>
     * </li>
     * <li>Scheduled nodes support the following two scaling methods:<ul>
     * <li>Specify the scaling rule to be executed by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task. A scheduled task is a preset node. You can invoke the CreateScheduledTask API to create a scheduled task that executes a specified scaling rule at a specified time to automatically scale the compute resource, meeting business requirements while controlling costs.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>使指定伸缩配置进入失效状态</p>
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
     * <b>summary</b> : 
     * <p>使指定伸缩配置进入失效状态</p>
     * 
     * @param request DeactivateScalingConfigurationRequest
     * @return DeactivateScalingConfigurationResponse
     */
    public DeactivateScalingConfigurationResponse deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you no longer need an event-triggered task, you can call the DeleteAlarm operation to delete it.</p>
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
     * <b>summary</b> : 
     * <p>Deletes an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you no longer need an event-triggered task, you can call the DeleteAlarm operation to delete it.</p>
     * 
     * @param request DeleteAlarmRequest
     * @return DeleteAlarmResponse
     */
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a health diagnosis report for a scaling group.</p>
     * 
     * @param request DeleteDiagnoseReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDiagnoseReportResponse
     */
    public DeleteDiagnoseReportResponse deleteDiagnoseReportWithOptions(DeleteDiagnoseReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDiagnoseReport"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiagnoseReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a health diagnosis report for a scaling group.</p>
     * 
     * @param request DeleteDiagnoseReportRequest
     * @return DeleteDiagnoseReportResponse
     */
    public DeleteDiagnoseReportResponse deleteDiagnoseReport(DeleteDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiagnoseReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot call this operation to delete a scaling configuration in the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration is in the Active state.</li>
     * <li>The scaling group contains elastic container instances created from the scaling configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling configuration of the Elastic Container Instance type. If the scaling configuration of a scaling group is in the Inactive state and the scaling group contains no elastic container instances created from the scaling configuration, you can call the DeleteEciScalingConfiguration operation to delete the scaling configuration to free up the scaling configuration quota.</p>
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
     * <b>description</b> :
     * <p>You cannot call this operation to delete a scaling configuration in the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration is in the Active state.</li>
     * <li>The scaling group contains elastic container instances created from the scaling configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling configuration of the Elastic Container Instance type. If the scaling configuration of a scaling group is in the Inactive state and the scaling group contains no elastic container instances created from the scaling configuration, you can call the DeleteEciScalingConfiguration operation to delete the scaling configuration to free up the scaling configuration quota.</p>
     * 
     * @param request DeleteEciScalingConfigurationRequest
     * @return DeleteEciScalingConfigurationResponse
     */
    public DeleteEciScalingConfigurationResponse deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete an effective lifecycle hook before its timeout period ends, the instances on which the lifecycle hook takes effect exits the Pending state ahead of schedule. You can use the following methods to delete a lifecycle hook:</p>
     * <ul>
     * <li>Include <code>LifecycleHookId</code> within your request to specify the lifecycle hook that you want to delete. In this case, <code>ScalingGroupId</code> and <code>LifecycleHookName</code> are ignored.</li>
     * <li>Include <code>ScalingGroupId</code> and <code>LifecycleHookName</code> within your request to specify the lifecycle hook that you want to delete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle hook. If you no longer require a lifecycle hook, you can call the DeleteLifecycleHook operation to delete it, which frees up the lifecycle hook quota.</p>
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
     * <b>description</b> :
     * <p>If you delete an effective lifecycle hook before its timeout period ends, the instances on which the lifecycle hook takes effect exits the Pending state ahead of schedule. You can use the following methods to delete a lifecycle hook:</p>
     * <ul>
     * <li>Include <code>LifecycleHookId</code> within your request to specify the lifecycle hook that you want to delete. In this case, <code>ScalingGroupId</code> and <code>LifecycleHookName</code> are ignored.</li>
     * <li>Include <code>ScalingGroupId</code> and <code>LifecycleHookName</code> within your request to specify the lifecycle hook that you want to delete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle hook. If you no longer require a lifecycle hook, you can call the DeleteLifecycleHook operation to delete it, which frees up the lifecycle hook quota.</p>
     * 
     * @param request DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     */
    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecycleHookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes event notification rules. The event notification feature facilitates efficient issue identification and event management by automatically forwarding notifications from Auto Scaling to designated endpoints such as CloudMonitor or Message Service (MNS) topics and queues. If you no longer require an event notification rule, you can call the DeleteNotificationConfiguration operation to delete it.</p>
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
     * <b>summary</b> : 
     * <p>Deletes event notification rules. The event notification feature facilitates efficient issue identification and event management by automatically forwarding notifications from Auto Scaling to designated endpoints such as CloudMonitor or Message Service (MNS) topics and queues. If you no longer require an event notification rule, you can call the DeleteNotificationConfiguration operation to delete it.</p>
     * 
     * @param request DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     */
    public DeleteNotificationConfigurationResponse deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete a scaling configuration in one of the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration in your scaling group is in the Active state.</li>
     * <li>The scaling group contains ECS instances that were created based on the scaling configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling configuration that is used to create Elastic Compute Service (ECS) instances.</p>
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
     * <b>description</b> :
     * <p>You cannot delete a scaling configuration in one of the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration in your scaling group is in the Active state.</li>
     * <li>The scaling group contains ECS instances that were created based on the scaling configuration.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling configuration that is used to create Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request DeleteScalingConfigurationRequest
     * @return DeleteScalingConfigurationResponse
     */
    public DeleteScalingConfigurationResponse deleteScalingConfiguration(DeleteScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the DeleteScalingGroup operation, take note of the following items:</p>
     * <ul>
     * <li>If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.</li>
     * <li>If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.</li>
     * <li>If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
     * **
     * <strong>Note</strong> Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.</li>
     * <li>If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.</li>
     * <li>Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
     * **
     * <strong>Note</strong> Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can create scaling groups to manage your computing power with ease. The computing power refers to the instances that provide the computing capability. If you no longer require a scaling group, you can call the DeleteScalingGroup operation to delete it to free up the scaling group quota.</p>
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
     * <b>description</b> :
     * <p>Before you call the DeleteScalingGroup operation, take note of the following items:</p>
     * <ul>
     * <li>If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.</li>
     * <li>If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.</li>
     * <li>If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
     * **
     * <strong>Note</strong> Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.</li>
     * <li>If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.</li>
     * <li>Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
     * **
     * <strong>Note</strong> Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can create scaling groups to manage your computing power with ease. The computing power refers to the instances that provide the computing capability. If you no longer require a scaling group, you can call the DeleteScalingGroup operation to delete it to free up the scaling group quota.</p>
     * 
     * @param request DeleteScalingGroupRequest
     * @return DeleteScalingGroupResponse
     */
    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scaling rule.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a scaling rule.</p>
     * 
     * @param request DeleteScalingRuleRequest
     * @return DeleteScalingRuleResponse
     */
    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes scheduled tasks. For workloads with predictable patterns, you can create scheduled tasks to align with your business requirements and optimize resource utilization for cost savings. These tasks automatically ensure that sufficient computing resources are provisioned in anticipation of peak hours and efficiently release unused resources during off-peak hours, thereby streamlining operational efficiency and reducing expenses. If you no longer require a scheduled task, you can call the DeleteScheduledTask operation to delete it.</p>
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
     * <b>summary</b> : 
     * <p>Deletes scheduled tasks. For workloads with predictable patterns, you can create scheduled tasks to align with your business requirements and optimize resource utilization for cost savings. These tasks automatically ensure that sufficient computing resources are provisioned in anticipation of peak hours and efficiently release unused resources during off-peak hours, thereby streamlining operational efficiency and reducing expenses. If you no longer require a scheduled task, you can call the DeleteScheduledTask operation to delete it.</p>
     * 
     * @param request DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the warmup pool of a scaling group and releases the instances in the warmup pool.</p>
     * 
     * @param request DeleteWarmPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWarmPoolResponse
     */
    public DeleteWarmPoolResponse deleteWarmPoolWithOptions(DeleteWarmPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "DeleteWarmPool"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWarmPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the warmup pool of a scaling group and releases the instances in the warmup pool.</p>
     * 
     * @param request DeleteWarmPoolRequest
     * @return DeleteWarmPoolResponse
     */
    public DeleteWarmPoolResponse deleteWarmPool(DeleteWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWarmPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about event-triggered tasks. This helps you track the configurations and metric data trends of existing event-triggered tasks, detect system resource anomalies in real time, and ensure system stability and reliability.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about event-triggered tasks. This helps you track the configurations and metric data trends of existing event-triggered tasks, detect system resource anomalies in real time, and ensure system stability and reliability.</p>
     * 
     * @param request DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of scaling activities that trigger text message, internal message, or email-based notifications. When you call the DescribeAlertConfiguration operation, you must specify the scaling group ID and region ID to query the status of the desired scaling activities. A scaling activity can be in one of the following states: Successful, Failed, and Rejected.</p>
     * 
     * @param request DescribeAlertConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertConfigurationResponse
     */
    public DescribeAlertConfigurationResponse describeAlertConfigurationWithOptions(DescribeAlertConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAlertConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of scaling activities that trigger text message, internal message, or email-based notifications. When you call the DescribeAlertConfiguration operation, you must specify the scaling group ID and region ID to query the status of the desired scaling activities. A scaling activity can be in one of the following states: Successful, Failed, and Rejected.</p>
     * 
     * @param request DescribeAlertConfigurationRequest
     * @return DescribeAlertConfigurationResponse
     */
    public DescribeAlertConfigurationResponse describeAlertConfiguration(DescribeAlertConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists candidate instance types.</p>
     * 
     * @param request DescribeCandidateInstanceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCandidateInstanceTypeResponse
     */
    public DescribeCandidateInstanceTypeResponse describeCandidateInstanceTypeWithOptions(DescribeCandidateInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCrossAz)) {
            query.put("AllowCrossAz", request.allowCrossAz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowDifferentGeneration)) {
            query.put("AllowDifferentGeneration", request.allowDifferentGeneration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskCategories)) {
            query.put("DataDiskCategories", request.dataDiskCategories);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrice)) {
            query.put("MaxPrice", request.maxPrice);
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

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategories)) {
            query.put("SystemDiskCategories", request.systemDiskCategories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIds)) {
            query.put("ZoneIds", request.zoneIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCandidateInstanceType"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCandidateInstanceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists candidate instance types.</p>
     * 
     * @param request DescribeCandidateInstanceTypeRequest
     * @return DescribeCandidateInstanceTypeResponse
     */
    public DescribeCandidateInstanceTypeResponse describeCandidateInstanceType(DescribeCandidateInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCandidateInstanceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health diagnostic reports.</p>
     * 
     * @param request DescribeDiagnoseReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnoseReportsResponse
     */
    public DescribeDiagnoseReportsResponse describeDiagnoseReportsWithOptions(DescribeDiagnoseReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnoseReports"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnoseReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health diagnostic reports.</p>
     * 
     * @param request DescribeDiagnoseReportsRequest
     * @return DescribeDiagnoseReportsResponse
     */
    public DescribeDiagnoseReportsResponse describeDiagnoseReports(DescribeDiagnoseReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnoseReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Elastic Container Instance (ECI) scaling configuration based on the scaling configuration ID. The details include the temporary storage size, the number of IPv6 addresses, and the elastic IP address (EIP) bandwidth. The output supports the YAML format.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of an Elastic Container Instance (ECI) scaling configuration based on the scaling configuration ID. The details include the temporary storage size, the number of IPv6 addresses, and the elastic IP address (EIP) bandwidth. The output supports the YAML format.</p>
     * 
     * @param request DescribeEciScalingConfigurationDetailRequest
     * @return DescribeEciScalingConfigurationDetailResponse
     */
    public DescribeEciScalingConfigurationDetailResponse describeEciScalingConfigurationDetail(DescribeEciScalingConfigurationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ECI scaling configurations. You can invoke DescribeEciScalingConfigurations and specify parameters such as the scaling group ID, and the scaling configuration IDs or names. This parameter query retrieves information such as the instance preemption policy, container group instance types, container image pull policy, and the weight of ECI instances as backend servers.</p>
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
     * <b>summary</b> : 
     * <p>Queries ECI scaling configurations. You can invoke DescribeEciScalingConfigurations and specify parameters such as the scaling group ID, and the scaling configuration IDs or names. This parameter query retrieves information such as the instance preemption policy, container group instance types, container image pull policy, and the weight of ECI instances as backend servers.</p>
     * 
     * @param request DescribeEciScalingConfigurationsRequest
     * @return DescribeEciScalingConfigurationsResponse
     */
    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>A scaling group\&quot;s configuration is key to successful scale-outs. Auto Scaling uses elasticity strength to quantify the effectiveness of a Scaling Configuration, helping you make targeted optimizations.</p>
     * 
     * @param request DescribeElasticStrengthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticStrengthResponse
     */
    public DescribeElasticStrengthResponse describeElasticStrengthWithOptions(DescribeElasticStrengthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticStrength"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticStrengthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A scaling group\&quot;s configuration is key to successful scale-outs. Auto Scaling uses elasticity strength to quantify the effectiveness of a Scaling Configuration, helping you make targeted optimizations.</p>
     * 
     * @param request DescribeElasticStrengthRequest
     * @return DescribeElasticStrengthResponse
     */
    public DescribeElasticStrengthResponse describeElasticStrength(DescribeElasticStrengthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticStrengthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Instance creation and deletion statistics.</p>
     * 
     * @param request DescribeInstanceCreateAndDeleteStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceCreateAndDeleteStatisticsResponse
     */
    public DescribeInstanceCreateAndDeleteStatisticsResponse describeInstanceCreateAndDeleteStatisticsWithOptions(DescribeInstanceCreateAndDeleteStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceCreateAndDeleteStatistics"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceCreateAndDeleteStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Instance creation and deletion statistics.</p>
     * 
     * @param request DescribeInstanceCreateAndDeleteStatisticsRequest
     * @return DescribeInstanceCreateAndDeleteStatisticsResponse
     */
    public DescribeInstanceCreateAndDeleteStatisticsResponse describeInstanceCreateAndDeleteStatistics(DescribeInstanceCreateAndDeleteStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceCreateAndDeleteStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance refresh tasks of a scaling group to view basic information and task progress.</p>
     * 
     * @param request DescribeInstanceRefreshesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceRefreshesResponse
     */
    public DescribeInstanceRefreshesResponse describeInstanceRefreshesWithOptions(DescribeInstanceRefreshesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskIds)) {
            query.put("InstanceRefreshTaskIds", request.instanceRefreshTaskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("action", "DescribeInstanceRefreshes"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceRefreshesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance refresh tasks of a scaling group to view basic information and task progress.</p>
     * 
     * @param request DescribeInstanceRefreshesRequest
     * @return DescribeInstanceRefreshesResponse
     */
    public DescribeInstanceRefreshesResponse describeInstanceRefreshes(DescribeInstanceRefreshesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceRefreshesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:</p>
     * <ul>
     * <li>If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
     * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle hook actions. When you call the DescribeLifecycleActions operation, you can specify parameters such as ScalingActivityId, NextToken, and MaxResults to query the details such as the action status and ID of a lifecycle hook. You can also call this operation to query the IDs of Elastic Compute Service (ECS) instances on which the lifecycle hook takes effect.</p>
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
     * <b>description</b> :
     * <p>If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:</p>
     * <ul>
     * <li>If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
     * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle hook actions. When you call the DescribeLifecycleActions operation, you can specify parameters such as ScalingActivityId, NextToken, and MaxResults to query the details such as the action status and ID of a lifecycle hook. You can also call this operation to query the IDs of Elastic Compute Service (ECS) instances on which the lifecycle hook takes effect.</p>
     * 
     * @param request DescribeLifecycleActionsRequest
     * @return DescribeLifecycleActionsResponse
     */
    public DescribeLifecycleActionsResponse describeLifecycleActions(DescribeLifecycleActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleActionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query lifecycle hooks in the following three ways:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs (LifecycleHookIds). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify a scaling group ID (ScalingGroupId).</li>
     * <li>Specify both a scaling group ID (ScalingGroupId) and a lifecycle hook name (LifecycleHookName).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of lifecycle hooks by specifying lifecycle hook IDs or scaling group IDs. The information includes the next action to perform after the wait state ends, the scaling activity type associated with the lifecycle hook, the notification recipient identifier, and the suspension wait time.</p>
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
     * <b>description</b> :
     * <p>You can query lifecycle hooks in the following three ways:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs (LifecycleHookIds). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify a scaling group ID (ScalingGroupId).</li>
     * <li>Specify both a scaling group ID (ScalingGroupId) and a lifecycle hook name (LifecycleHookName).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of lifecycle hooks by specifying lifecycle hook IDs or scaling group IDs. The information includes the next action to perform after the wait state ends, the scaling activity type associated with the lifecycle hook, the notification recipient identifier, and the suspension wait time.</p>
     * 
     * @param request DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     */
    public DescribeLifecycleHooksResponse describeLifecycleHooks(DescribeLifecycleHooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleHooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource quotas. For example, you can call the DescribeLimitation operation to query the maximum numbers of scheduled tasks that you can create in a scaling group, load balancers that you can attach to a scaling group, instances that you can add to a scaling group, and scaling configurations that you can create in a scaling group.</p>
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
     * <b>summary</b> : 
     * <p>Queries resource quotas. For example, you can call the DescribeLimitation operation to query the maximum numbers of scheduled tasks that you can create in a scaling group, load balancers that you can attach to a scaling group, instances that you can add to a scaling group, and scaling configurations that you can create in a scaling group.</p>
     * 
     * @param request DescribeLimitationRequest
     * @return DescribeLimitationResponse
     */
    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries notification settings. You can call the DescribeNotificationConfiguration operation to query notification settings of scaling events or resource changes, including the notification types and methods.</p>
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
     * <b>summary</b> : 
     * <p>Queries notification settings. You can call the DescribeNotificationConfiguration operation to query notification settings of scaling events or resource changes, including the notification types and methods.</p>
     * 
     * @param request DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     */
    public DescribeNotificationConfigurationsResponse describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries notification types. You can call the DescribeNotificationTypes operation to query the types of notifications on scaling events or resource changes occurred in your scaling groups. Notifications are triggered in scenarios such as successful scale-out events, successful scale-in events, expiration of scheduled tasks, and partially successful scale-out events.</p>
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
     * <b>summary</b> : 
     * <p>Queries notification types. You can call the DescribeNotificationTypes operation to query the types of notifications on scaling events or resource changes occurred in your scaling groups. Notifications are triggered in scenarios such as successful scale-out events, successful scale-in events, expiration of scheduled tasks, and partially successful scale-out events.</p>
     * 
     * @param request DescribeNotificationTypesRequest
     * @return DescribeNotificationTypesResponse
     */
    public DescribeNotificationTypesResponse describeNotificationTypes(DescribeNotificationTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance types that meet specified requirements by filtering based on parameters such as the vSwitch ID, number of vCPUs, memory size, instance family level, and maximum acceptable price.</p>
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
     * <b>summary</b> : 
     * <p>Queries instance types that meet specified requirements by filtering based on parameters such as the vSwitch ID, number of vCPUs, memory size, instance family level, and maximum acceptable price.</p>
     * 
     * @param request DescribePatternTypesRequest
     * @return DescribePatternTypesResponse
     */
    public DescribePatternTypesResponse describePatternTypes(DescribePatternTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePatternTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions. Before you activate Auto Scaling, you can call the DescribeRegions operation to query the regions where Auto Scaling is officially launched. This preliminary step facilitates the strategic selection of both the optimal region and availability zones for activating Auto Scaling, thereby guaranteeing the finest access speeds and operational efficiency within your chosen geographical area.</p>
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
     * <b>summary</b> : 
     * <p>Queries regions. Before you activate Auto Scaling, you can call the DescribeRegions operation to query the regions where Auto Scaling is officially launched. This preliminary step facilitates the strategic selection of both the optimal region and availability zones for activating Auto Scaling, thereby guaranteeing the finest access speeds and operational efficiency within your chosen geographical area.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify a scaling group ID to query all scaling activity records in the scaling group.</li>
     * <li>You can filter query results by the status of the scaling activity.</li>
     * <li>You can query the scaling activity that occurred within the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of scaling activities to check the results of scaling activities triggered by scheduled tasks, event-triggered tasks, or manual execution of scaling rules. For example, you can view the status, cause, and total number of instances after the scaling activity on the scaling activity details page.</p>
     * 
     * @param request DescribeScalingActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivitiesWithOptions(DescribeScalingActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskId)) {
            query.put("InstanceRefreshTaskId", request.instanceRefreshTaskId);
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
     * <b>description</b> :
     * <ul>
     * <li>You can specify a scaling group ID to query all scaling activity records in the scaling group.</li>
     * <li>You can filter query results by the status of the scaling activity.</li>
     * <li>You can query the scaling activity that occurred within the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of scaling activities to check the results of scaling activities triggered by scheduled tasks, event-triggered tasks, or manual execution of scaling rules. For example, you can view the status, cause, and total number of instances after the scaling activity on the scaling activity details page.</p>
     * 
     * @param request DescribeScalingActivitiesRequest
     * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivities(DescribeScalingActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a scaling activity. You can query a scaling activity by its ID. The scaling activity details include the scaling activity status, error code, and error message. You can efficiently troubleshoot issues and analyze service performance based on the error message.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a scaling activity. You can query a scaling activity by its ID. The scaling activity details include the scaling activity status, error code, and error message. You can efficiently troubleshoot issues and analyze service performance based on the error message.</p>
     * 
     * @param request DescribeScalingActivityDetailRequest
     * @return DescribeScalingActivityDetailResponse
     */
    public DescribeScalingActivityDetailResponse describeScalingActivityDetail(DescribeScalingActivityDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivityDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The distribution of scaling activities in different states over a period of time.</p>
     * 
     * @param request DescribeScalingActivityStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingActivityStatisticsResponse
     */
    public DescribeScalingActivityStatisticsResponse describeScalingActivityStatisticsWithOptions(DescribeScalingActivityStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingActivityStatistics"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingActivityStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The distribution of scaling activities in different states over a period of time.</p>
     * 
     * @param request DescribeScalingActivityStatisticsRequest
     * @return DescribeScalingActivityStatisticsResponse
     */
    public DescribeScalingActivityStatisticsResponse describeScalingActivityStatistics(DescribeScalingActivityStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivityStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about ECS-type scaling configurations, including instance types and images, to help you understand the details of ECS instance templates used during scale-out.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about ECS-type scaling configurations, including instance types and images, to help you understand the details of ECS instance templates used during scale-out.</p>
     * 
     * @param request DescribeScalingConfigurationsRequest
     * @return DescribeScalingConfigurationsResponse
     */
    public DescribeScalingConfigurationsResponse describeScalingConfigurations(DescribeScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified scaling group, such as the basic information, instances in the scaling group, and scaling configurations. If the OutputFormat parameter is set to YAML for an Elastic Container Instance (ECI) scaling group, the content in the Kubernetes Deployment YAML format is returned.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a specified scaling group, such as the basic information, instances in the scaling group, and scaling configurations. If the OutputFormat parameter is set to YAML for an Elastic Container Instance (ECI) scaling group, the content in the Kubernetes Deployment YAML format is returned.</p>
     * 
     * @param request DescribeScalingGroupDetailRequest
     * @return DescribeScalingGroupDetailResponse
     */
    public DescribeScalingGroupDetailResponse describeScalingGroupDetail(DescribeScalingGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeScalingGroupDiagnoseDetails</p>
     * 
     * @param request DescribeScalingGroupDiagnoseDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScalingGroupDiagnoseDetailsResponse
     */
    public DescribeScalingGroupDiagnoseDetailsResponse describeScalingGroupDiagnoseDetailsWithOptions(DescribeScalingGroupDiagnoseDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingGroupDiagnoseDetails"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingGroupDiagnoseDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeScalingGroupDiagnoseDetails</p>
     * 
     * @param request DescribeScalingGroupDiagnoseDetailsRequest
     * @return DescribeScalingGroupDiagnoseDetailsResponse
     */
    public DescribeScalingGroupDiagnoseDetailsResponse describeScalingGroupDiagnoseDetails(DescribeScalingGroupDiagnoseDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupDiagnoseDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of scaling groups, including basic information, instances in the scaling groups, and scaling configurations.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of scaling groups, including basic information, instances in the scaling groups, and scaling configurations.</p>
     * 
     * @param request DescribeScalingGroupsRequest
     * @return DescribeScalingGroupsResponse
     */
    public DescribeScalingGroupsResponse describeScalingGroups(DescribeScalingGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ECS instances and their details in a scaling group by scaling group ID. The details include the total number of running spot instances, the total number of ECS instances, the warmup status, and the lifecycle status of the ECS instances in the scaling group. This operation also allows you to filter ECS instances by health status, lifecycle status, and creation type.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of ECS instances and their details in a scaling group by scaling group ID. The details include the total number of running spot instances, the total number of ECS instances, the warmup status, and the lifecycle status of the ECS instances in the scaling group. This operation also allows you to filter ECS instances by health status, lifecycle status, and creation type.</p>
     * 
     * @param request DescribeScalingInstancesRequest
     * @return DescribeScalingInstancesResponse
     */
    public DescribeScalingInstancesResponse describeScalingInstances(DescribeScalingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries scaling rules and their details by specifying parameters such as the scaling rule ID, scaling rule name, and unique identifier of the scaling rule. The details include the adjustment type, instance warmup time, and event-triggered tasks associated with the scaling rules.</p>
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
     * <b>summary</b> : 
     * <p>Queries scaling rules and their details by specifying parameters such as the scaling rule ID, scaling rule name, and unique identifier of the scaling rule. The details include the adjustment type, instance warmup time, and event-triggered tasks associated with the scaling rules.</p>
     * 
     * @param request DescribeScalingRulesRequest
     * @return DescribeScalingRulesResponse
     */
    public DescribeScalingRulesResponse describeScalingRules(DescribeScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query scheduled tasks by scheduled task ID, scheduled task name, or the scaling rule executed by the scheduled task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of scheduled tasks. A scheduled task is a preset task that executes a specified scaling rule at a specified time to implement automatic scale-out and scale-in of compute resources. After you create a scheduled task, you can call the DescribeScheduledTasks API to query the details of the scheduled task, such as the trigger time, the total number of scheduled tasks, and the ID of the scaling group that executes the scheduled task.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskEnabled)) {
            query.put("TaskEnabled", request.taskEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
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
     * <b>description</b> :
     * <p>You can query scheduled tasks by scheduled task ID, scheduled task name, or the scaling rule executed by the scheduled task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of scheduled tasks. A scheduled task is a preset task that executes a specified scaling rule at a specified time to implement automatic scale-out and scale-in of compute resources. After you create a scheduled task, you can call the DescribeScheduledTasks API to query the details of the scheduled task, such as the trigger time, the total number of scheduled tasks, and the ID of the scaling group that executes the scheduled task.</p>
     * 
     * @param request DescribeScheduledTasksRequest
     * @return DescribeScheduledTasksResponse
     */
    public DescribeScheduledTasksResponse describeScheduledTasks(DescribeScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScheduledTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of ECS instances in the warm pool of a scaling group.</p>
     * 
     * @param request DescribeWarmPoolInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWarmPoolInstancesResponse
     */
    public DescribeWarmPoolInstancesResponse describeWarmPoolInstancesWithOptions(DescribeWarmPoolInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWarmPoolInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWarmPoolInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of ECS instances in the warm pool of a scaling group.</p>
     * 
     * @param request DescribeWarmPoolInstancesRequest
     * @return DescribeWarmPoolInstancesResponse
     */
    public DescribeWarmPoolInstancesResponse describeWarmPoolInstances(DescribeWarmPoolInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWarmPoolInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches Application Load Balancer (ALB) server groups from a scaling group. When you call the DetachAlbServerGroups operation, you can specify the scaling group ID, ALB server group ID, and port used by Elastic Compute Service (ECS) instances in the desired ALB server group to detach one or more ALB server groups from your scaling group.</p>
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
     * <b>summary</b> : 
     * <p>Detaches Application Load Balancer (ALB) server groups from a scaling group. When you call the DetachAlbServerGroups operation, you can specify the scaling group ID, ALB server group ID, and port used by Elastic Compute Service (ECS) instances in the desired ALB server group to detach one or more ALB server groups from your scaling group.</p>
     * 
     * @param request DetachAlbServerGroupsRequest
     * @return DetachAlbServerGroupsResponse
     */
    public DetachAlbServerGroupsResponse detachAlbServerGroups(DetachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAlbServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches one or more ApsaraDB RDS instances from a scaling group to remove the mandatory association between the scaling group and the RDS instances and improve flexibility.</p>
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
     * <b>summary</b> : 
     * <p>Detaches one or more ApsaraDB RDS instances from a scaling group to remove the mandatory association between the scaling group and the RDS instances and improve flexibility.</p>
     * 
     * @param request DetachDBInstancesRequest
     * @return DetachDBInstancesResponse
     */
    public DetachDBInstancesResponse detachDBInstances(DetachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDBInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call the DetachInstances operation, make sure that the following conditions are met:
     *     *   The specified scaling group is enabled.
     *     *   The specified scaling group does not have any ongoing scaling activities.
     *     **
     *     <strong>Note</strong> If the specified scaling group does not have any ongoing scaling activities, the operation can bypass the cooldown period of the scaling group and immediately trigger scaling activities.</p>
     * <ul>
     * <li>Before you call this operation, take note of the following items:<ul>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation can run independently. If needed, you can call the <a href="https://help.aliyun.com/document_detail/25954.html">AttachInstances</a> operation to re-add these instances to a scaling group.</li>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation are not stopped or released.</li>
     * <li>A successful call only means that Auto Scaling accepts your request. Scaling activities can be triggered as expected, but their successful execution is not guaranteed. You can query the status of a scaling activity based on the ScalingActivityId response parameter.</li>
     * <li>The removal of ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances must not result in the overall number of instances within the specified scaling group falling below the minimum capacity threshold (MinSize); otherwise, an error will be reported.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes instances from a scaling group. If an enabled scaling group has no ongoing scaling activities, you can call the DetachInstances operation to remove one or more Elastic Compute Service (ECS) instances, elastic container instances, or Alibaba Cloud-hosted third-party instances from the scaling group.</p>
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
     * <b>description</b> :
     * <p>  Before you call the DetachInstances operation, make sure that the following conditions are met:
     *     *   The specified scaling group is enabled.
     *     *   The specified scaling group does not have any ongoing scaling activities.
     *     **
     *     <strong>Note</strong> If the specified scaling group does not have any ongoing scaling activities, the operation can bypass the cooldown period of the scaling group and immediately trigger scaling activities.</p>
     * <ul>
     * <li>Before you call this operation, take note of the following items:<ul>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation can run independently. If needed, you can call the <a href="https://help.aliyun.com/document_detail/25954.html">AttachInstances</a> operation to re-add these instances to a scaling group.</li>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation are not stopped or released.</li>
     * <li>A successful call only means that Auto Scaling accepts your request. Scaling activities can be triggered as expected, but their successful execution is not guaranteed. You can query the status of a scaling activity based on the ScalingActivityId response parameter.</li>
     * <li>The removal of ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances must not result in the overall number of instances within the specified scaling group falling below the minimum capacity threshold (MinSize); otherwise, an error will be reported.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes instances from a scaling group. If an enabled scaling group has no ongoing scaling activities, you can call the DetachInstances operation to remove one or more Elastic Compute Service (ECS) instances, elastic container instances, or Alibaba Cloud-hosted third-party instances from the scaling group.</p>
     * 
     * @param request DetachInstancesRequest
     * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instances from a scaling group. If the current CLB instance no longer meets your business requirements, you can call the DetachLoadBalancers operation to detach it from your scaling group. When you call this operation, you can use ScalingGroupId, LoadBalancer.N, and ForceDetach to specify one or more CLB instances to detach. You can also determine whether to call this operation asynchronously and whether to remove the Elastic Compute Service (ECS) instances acting as backend servers from the backend server groups of the CLB instance. You can call this operation to detach only CLB instances from a scaling group.</p>
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
     * <b>summary</b> : 
     * <p>Detaches Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instances from a scaling group. If the current CLB instance no longer meets your business requirements, you can call the DetachLoadBalancers operation to detach it from your scaling group. When you call this operation, you can use ScalingGroupId, LoadBalancer.N, and ForceDetach to specify one or more CLB instances to detach. You can also determine whether to call this operation asynchronously and whether to remove the Elastic Compute Service (ECS) instances acting as backend servers from the backend server groups of the CLB instance. You can call this operation to detach only CLB instances from a scaling group.</p>
     * 
     * @param request DetachLoadBalancersRequest
     * @return DetachLoadBalancersResponse
     */
    public DetachLoadBalancersResponse detachLoadBalancers(DetachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLoadBalancersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove one or more SLB server groups from a scaling group. Supported server group types include Application Load Balancer (ALB), Network Load Balancer (NLB), and Gateway Load Balancer (GWLB), which can dynamically adjust SLB policies and help improve high availability of the system.</p>
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
     * <b>summary</b> : 
     * <p>Remove one or more SLB server groups from a scaling group. Supported server group types include Application Load Balancer (ALB), Network Load Balancer (NLB), and Gateway Load Balancer (GWLB), which can dynamically adjust SLB policies and help improve high availability of the system.</p>
     * 
     * @param request DetachServerGroupsRequest
     * @return DetachServerGroupsResponse
     */
    public DetachServerGroupsResponse detachServerGroups(DetachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
     *     *   LoadBalancerId: the ID of the load balancer
     *     *   VServerGroupId: the ID of the vServer group
     *     *   Port: the port number of the vServer group</p>
     * <ul>
     * <li>When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.</li>
     * <li>Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detaches vServer groups from a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups to improve service performance. If the load balancer currently attached to your scaling group is no longer needed to distribute the access traffic to the instances in your scaling group, you can call the DetachVServerGroups operation to detach one or more vServer groups of this load balancer from the scaling group.</p>
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
     * <b>description</b> :
     * <p>  When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
     *     *   LoadBalancerId: the ID of the load balancer
     *     *   VServerGroupId: the ID of the vServer group
     *     *   Port: the port number of the vServer group</p>
     * <ul>
     * <li>When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.</li>
     * <li>Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detaches vServer groups from a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups to improve service performance. If the load balancer currently attached to your scaling group is no longer needed to distribute the access traffic to the instances in your scaling group, you can call the DetachVServerGroups operation to detach one or more vServer groups of this load balancer from the scaling group.</p>
     * 
     * @param request DetachVServerGroupsRequest
     * @return DetachVServerGroupsResponse
     */
    public DetachVServerGroupsResponse detachVServerGroups(DetachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVServerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you disable an event-triggered task, make sure that the task is in the <code>Normal</code>, <code>Alert</code>, or <code>Insufficient Data</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you currently do not need an event-triggered task, you can call the DisableAlarm operation to disable it.</p>
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
     * <b>description</b> :
     * <p>Before you disable an event-triggered task, make sure that the task is in the <code>Normal</code>, <code>Alert</code>, or <code>Insufficient Data</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you currently do not need an event-triggered task, you can call the DisableAlarm operation to disable it.</p>
     * 
     * @param request DisableAlarmRequest
     * @return DisableAlarmResponse
     */
    public DisableAlarmResponse disableAlarm(DisableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to disable a scaling group, take note of the following items:</p>
     * <ul>
     * <li>If scaling activities are being executed in the specified scaling group when you call this operation, these activities will continue until they are complete. However, scaling activities that are triggered after this operation is called will be rejected.</li>
     * <li>This operation can be called only when the scaling group is in the Active state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling group. If you temporarily do not require a scaling group that is in the Enabled state, you can call the DisableScalingGroup operation to disable it.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation to disable a scaling group, take note of the following items:</p>
     * <ul>
     * <li>If scaling activities are being executed in the specified scaling group when you call this operation, these activities will continue until they are complete. However, scaling activities that are triggered after this operation is called will be rejected.</li>
     * <li>This operation can be called only when the scaling group is in the Active state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling group. If you temporarily do not require a scaling group that is in the Enabled state, you can call the DisableScalingGroup operation to disable it.</p>
     * 
     * @param request DisableScalingGroupRequest
     * @return DisableScalingGroupResponse
     */
    public DisableScalingGroupResponse disableScalingGroup(DisableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you want to reuse an event-triggered task that is in the Disabled state, you can call the EnableAlarm operation to enable it.</p>
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
     * <b>summary</b> : 
     * <p>Enables an event-triggered task. If your business pattern is unpredictable or prone to unforeseen traffic spikes, you can create event-triggered tasks by associating CloudMonitor metrics to effectively monitor fluctuations in your business workload. Upon detecting that the criteria for alerts, as specified in event-triggered tasks, are fulfilled, Auto Scaling promptly issues alerts and executes the scaling rules predefined within those tasks. This process occurs within the predefined effective time windows of the tasks, thereby facilitating the automatic increase or decrease of Elastic Compute Service (ECS) instances or elastic container instances within your scaling groups. Ultimately, this mechanism ensures the dynamic optimization of resources based on real-time workload demands. If you want to reuse an event-triggered task that is in the Disabled state, you can call the EnableAlarm operation to enable it.</p>
     * 
     * @param request EnableAlarmRequest
     * @return EnableAlarmResponse
     */
    public EnableAlarmResponse enableAlarm(EnableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to enable a scaling group only if the scaling group is in the Inactive state and contains an instance configuration source such as a launch temple or a scaling configuration. The instance configuration source can also be the Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If the preceding requirements are not met, the operation will fail.
     *     **
     *     <strong>Note</strong> A scaling group can have only one active instance configuration source at a time. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If the scaling group already have an instance configuration source defined prior to your calling, the scaling configuration or launch template specified within your request will supersede the existing scaling configuration or launch template.</p>
     * <ul>
     * <li>If you specify InstanceId.N to add to the scaling group within your request, Auto Scaling will check whether the addition of InstanceId.N will cause the total number of ECS instances in the scaling group to fall outside the boundaries specified by MinSize and MaxSize after you call this operation.<ul>
     * <li>If the call results in the total number of ECS instances dropping below the value of MinSize, Auto Scaling proactively creates pay-as-you-go ECS instances to ensure that the total number reaches the minimum threshold. For example, if you set MinSize to 5 when you created a scaling group and include InstanceId.N within your request to add two ECS instances when you attempt to enable the scaling group, Auto Scaling creates three more ECS instances in the scaling group after the two ECS instances are added.</li>
     * <li>If the call results in the total number of ECS instances exceeding the value of MaxSize, the operation fails.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling group. If a scaling group is in the Disabled state and contains an instance configuration source such as a launch template or a scaling configuration, you can call the EnableScalingGroup operation to enable the scaling group. This operation permits Auto Scaling to dynamically adjust the computing power (also known as the number of instances) in the scaling group based on your business requirements.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to enable a scaling group only if the scaling group is in the Inactive state and contains an instance configuration source such as a launch temple or a scaling configuration. The instance configuration source can also be the Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If the preceding requirements are not met, the operation will fail.
     *     **
     *     <strong>Note</strong> A scaling group can have only one active instance configuration source at a time. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If the scaling group already have an instance configuration source defined prior to your calling, the scaling configuration or launch template specified within your request will supersede the existing scaling configuration or launch template.</p>
     * <ul>
     * <li>If you specify InstanceId.N to add to the scaling group within your request, Auto Scaling will check whether the addition of InstanceId.N will cause the total number of ECS instances in the scaling group to fall outside the boundaries specified by MinSize and MaxSize after you call this operation.<ul>
     * <li>If the call results in the total number of ECS instances dropping below the value of MinSize, Auto Scaling proactively creates pay-as-you-go ECS instances to ensure that the total number reaches the minimum threshold. For example, if you set MinSize to 5 when you created a scaling group and include InstanceId.N within your request to add two ECS instances when you attempt to enable the scaling group, Auto Scaling creates three more ECS instances in the scaling group after the two ECS instances are added.</li>
     * <li>If the call results in the total number of ECS instances exceeding the value of MaxSize, the operation fails.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling group. If a scaling group is in the Disabled state and contains an instance configuration source such as a launch template or a scaling configuration, you can call the EnableScalingGroup operation to enable the scaling group. This operation permits Auto Scaling to dynamically adjust the computing power (also known as the number of instances) in the scaling group based on your business requirements.</p>
     * 
     * @param request EnableScalingGroupRequest
     * @return EnableScalingGroupResponse
     */
    public EnableScalingGroupResponse enableScalingGroup(EnableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.</li>
     * <li>You can remove an instance that is in the Standby state from a scaling group, and then release the instance.</li>
     * <li>ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.</li>
     * <li>If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Puts an Elastic Compute Service (ECS) instance into the Standby state.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.</li>
     * <li>You can remove an instance that is in the Standby state from a scaling group, and then release the instance.</li>
     * <li>ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.</li>
     * <li>If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Puts an Elastic Compute Service (ECS) instance into the Standby state.</p>
     * 
     * @param request EnterStandbyRequest
     * @return EnterStandbyResponse
     */
    public EnterStandbyResponse enterStandby(EnterStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterStandbyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Executes a scaling rule. To adjust the number of Elastic Compute Service (ECS) instances or elastic container instances, you can manually execute a scaling rule or enable Auto Scaling to execute a scaling rule. You can call the ExecuteScalingRule operation to execute simple scaling rules or step scaling rules. Auto Scaling automatically executes target tracking scaling rules and predictive scaling rules on your behalf without requiring explicit execution calls.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Executes a scaling rule. To adjust the number of Elastic Compute Service (ECS) instances or elastic container instances, you can manually execute a scaling rule or enable Auto Scaling to execute a scaling rule. You can call the ExecuteScalingRule operation to execute simple scaling rules or step scaling rules. Auto Scaling automatically executes target tracking scaling rules and predictive scaling rules on your behalf without requiring explicit execution calls.</p>
     * 
     * @param request ExecuteScalingRuleRequest
     * @return ExecuteScalingRuleResponse
     */
    public ExecuteScalingRuleResponse executeScalingRule(ExecuteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After ECS instances or elastic container instances are removed from the Standby state, the following rules apply:</p>
     * <ul>
     * <li>The ECS instances or elastic container instances enter the In Service state.</li>
     * <li>The default weight of each ECS instance or elastic container instance as a backend server of the attached load balancer is 50.</li>
     * <li>If you stop or restart the ECS instances or elastic container instances, the health check status of the instances will be updated.</li>
     * <li>When a scale-in event is triggered, Auto Scaling may remove the ECS instances or elastic container instances from the scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an instance from the Standby state. When a scale-in event is triggered in a scaling group, Auto Scaling does not remove Elastic Compute Service (ECS) instances or elastic container instances that are in the Standby state from the scaling group. If you want to restart the instances that are in the Standby state, you can call the ExitStandby operation to remove the instances from the Standby state and put them into the In Service state.</p>
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
     * <b>description</b> :
     * <p>After ECS instances or elastic container instances are removed from the Standby state, the following rules apply:</p>
     * <ul>
     * <li>The ECS instances or elastic container instances enter the In Service state.</li>
     * <li>The default weight of each ECS instance or elastic container instance as a backend server of the attached load balancer is 50.</li>
     * <li>If you stop or restart the ECS instances or elastic container instances, the health check status of the instances will be updated.</li>
     * <li>When a scale-in event is triggered, Auto Scaling may remove the ECS instances or elastic container instances from the scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes an instance from the Standby state. When a scale-in event is triggered in a scaling group, Auto Scaling does not remove Elastic Compute Service (ECS) instances or elastic container instances that are in the Standby state from the scaling group. If you want to restart the instances that are in the Standby state, you can call the ExitStandby operation to remove the instances from the Standby state and put them into the In Service state.</p>
     * 
     * @param request ExitStandbyRequest
     * @return ExitStandbyResponse
     */
    public ExitStandbyResponse exitStandby(ExitStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exitStandbyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys added to Auto Scaling resources. Querying tag keys facilitates easier classification, identification, and monitoring of your Auto Scaling resources, thereby enhancing the flexibility and convenience of your resource management processes.</p>
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
     * <b>summary</b> : 
     * <p>Queries the tag keys added to Auto Scaling resources. Querying tag keys facilitates easier classification, identification, and monitoring of your Auto Scaling resources, thereby enhancing the flexibility and convenience of your resource management processes.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Specify at least one of the following request parameters: <code>ResourceIds</code> and <code>Tags</code>. <code>Tags.Key</code> and <code>Tags.Value</code> are used to specify the query objects.</p>
     * <ul>
     * <li>If you provide both <code>ResourceIds</code> and <code>Tags</code> in your request, the response will exclusively include Auto Scaling resources that satisfy the criteria set by these parameters, ensuring targeted and precise information retrieval.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tags. You can call the ListTagResources operation to query tags that are added to Auto Scaling resources, thereby clarifying resource utilization and facilitating efficient resource management. This operation aids in the automation of resource categorization and permission management processes.</p>
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
     * <b>description</b> :
     * <p>  Specify at least one of the following request parameters: <code>ResourceIds</code> and <code>Tags</code>. <code>Tags.Key</code> and <code>Tags.Value</code> are used to specify the query objects.</p>
     * <ul>
     * <li>If you provide both <code>ResourceIds</code> and <code>Tags</code> in your request, the response will exclusively include Auto Scaling resources that satisfy the criteria set by these parameters, ensuring targeted and precise information retrieval.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tags. You can call the ListTagResources operation to query tags that are added to Auto Scaling resources, thereby clarifying resource utilization and facilitating efficient resource management. This operation aids in the automation of resource categorization and permission management processes.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag keys associated with Auto Scaling resources to facilitate a deeper comprehension of those resources. By doing so, you can categorize and manage your Auto Scaling resources more efficiently.</p>
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
     * <b>summary</b> : 
     * <p>Queries the tag keys associated with Auto Scaling resources to facilitate a deeper comprehension of those resources. By doing so, you can categorize and manage your Auto Scaling resources more efficiently.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom monitoring metrics to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks for custom monitoring</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimension.N.DimensionKey and Dimension.N.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS instances or elastic container instances in the scaling group of the specified user.<ul>
     * <li>The metrics of a custom monitoring event-triggered task (MetricType=custom) depend on your custom monitoring metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system. You must manually specify device and state. For more information, see the Dimension.N.DimensionKey and Dimension.N.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an event-triggered task.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom monitoring metrics to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks for custom monitoring</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimension.N.DimensionKey and Dimension.N.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS instances or elastic container instances in the scaling group of the specified user.<ul>
     * <li>The metrics of a custom monitoring event-triggered task (MetricType=custom) depend on your custom monitoring metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system. You must manually specify device and state. For more information, see the Dimension.N.DimensionKey and Dimension.N.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an event-triggered task.</p>
     * 
     * @param request ModifyAlarmRequest
     * @return ModifyAlarmResponse
     */
    public ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of scaling activities that prompt text message or email notifications.</p>
     * 
     * @param request ModifyAlertConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAlertConfigurationResponse
     */
    public ModifyAlertConfigurationResponse modifyAlertConfigurationWithOptions(ModifyAlertConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStatuses)) {
            query.put("ScaleStatuses", request.scaleStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAlertConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAlertConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of scaling activities that prompt text message or email notifications.</p>
     * 
     * @param request ModifyAlertConfigurationRequest
     * @return ModifyAlertConfigurationResponse
     */
    public ModifyAlertConfigurationResponse modifyAlertConfiguration(ModifyAlertConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAlertConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of the scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/459374.html">DescribeEciScalingConfigurations</a> operation to query and verify the modification result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration by specifying parameters such as the ID of the scaling configuration to be modified, the name of the scaling configuration, and the attributes of the Elastic Container Instance (ECI), such as the instance restart policy, the preemption policy, and the bandwidth of the elastic IP address (EIP).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            query.put("GpuDriverVersion", request.gpuDriverVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
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
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of the scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/459374.html">DescribeEciScalingConfigurations</a> operation to query and verify the modification result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration by specifying parameters such as the ID of the scaling configuration to be modified, the name of the scaling configuration, and the attributes of the Elastic Container Instance (ECI), such as the instance restart policy, the preemption policy, and the bandwidth of the elastic IP address (EIP).</p>
     * 
     * @param request ModifyEciScalingConfigurationRequest
     * @return ModifyEciScalingConfigurationResponse
     */
    public ModifyEciScalingConfigurationResponse modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of an ECS instance in a scaling group. Currently, only the lifecycle management attribute of instances manually added to the scaling group can be modified.</p>
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
     * <b>summary</b> : 
     * <p>Modifies the attributes of an ECS instance in a scaling group. Currently, only the lifecycle management attribute of instances manually added to the scaling group can be modified.</p>
     * 
     * @param request ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify the lifecycle hook to be modified in one of the following ways:</p>
     * <ul>
     * <li>Specify only the lifecycle hook ID (LifecycleHookId). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify both the scaling group ID (ScalingGroupId) and the lifecycle hook name (LifecycleHookName). The lifecycle hook name is unique within a scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a lifecycle hook, such as the applicable scaling activity type, the wait time for the scaling activity, and the subsequent action after the wait state ends. You can specify the lifecycle hook by its ID or name and the scaling group ID without the need to delete the lifecycle hook if it no longer meets your business requirements.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionSources)) {
            query.put("LifecycleActionSources", request.lifecycleActionSources);
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
     * <b>description</b> :
     * <p>You can specify the lifecycle hook to be modified in one of the following ways:</p>
     * <ul>
     * <li>Specify only the lifecycle hook ID (LifecycleHookId). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify both the scaling group ID (ScalingGroupId) and the lifecycle hook name (LifecycleHookName). The lifecycle hook name is unique within a scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a lifecycle hook, such as the applicable scaling activity type, the wait time for the scaling activity, and the subsequent action after the wait state ends. You can specify the lifecycle hook by its ID or name and the scaling group ID without the need to delete the lifecycle hook if it no longer meets your business requirements.</p>
     * 
     * @param request ModifyLifecycleHookRequest
     * @return ModifyLifecycleHookResponse
     */
    public ModifyLifecycleHookResponse modifyLifecycleHook(ModifyLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecycleHookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies event notification rules. Event notification rules support automatic sending of notifications to CloudMonitor, Message Service (MNS) topics, or MNS queues when a specified type of events occur. This helps you learn about the dynamics of your scaling group at the earliest opportunity and further automate resource management. If an existing event notification rule does not meet your business requirements, you can call the ModifyNotificationConfiguration operation to modify the event notification rule, without the need to create a new rule. Take not that you cannot modify the notification method of an event notification rule by calling this operation.</p>
     * 
     * @param request ModifyNotificationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNotificationConfigurationResponse
     */
    public ModifyNotificationConfigurationResponse modifyNotificationConfigurationWithOptions(ModifyNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageEncoding)) {
            query.put("MessageEncoding", request.messageEncoding);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
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
     * <b>summary</b> : 
     * <p>Modifies event notification rules. Event notification rules support automatic sending of notifications to CloudMonitor, Message Service (MNS) topics, or MNS queues when a specified type of events occur. This helps you learn about the dynamics of your scaling group at the earliest opportunity and further automate resource management. If an existing event notification rule does not meet your business requirements, you can call the ModifyNotificationConfiguration operation to modify the event notification rule, without the need to create a new rule. Take not that you cannot modify the notification method of an event notification rule by calling this operation.</p>
     * 
     * @param request ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     */
    public ModifyNotificationConfigurationResponse modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNotificationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of a scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can bind a primary network interface card (NIC) by using one of the following methods. However, you can use only one method in a single request. If you use both methods, the request fails and an error message is returned. When you modify the scaling configuration by using one method, the NIC configuration set by the other method is cleared.<ul>
     * <li>Directly configure the primary NIC by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Configure the primary NIC and secondary NICs by using the NetworkInterfaces parameter. When you use the NetworkInterfaces parameter, you must configure the primary NIC. If NetworkInterface.InstanceType is set to Primary, the primary NIC is configured. If NetworkInterface.InstanceType is set to Secondary or left empty, a secondary NIC is configured.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an ECS-type scaling configuration (the ECS instance template for scale-out) if the current scaling configuration does not meet your business requirements.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.httpEndpoint)) {
            query.put("HttpEndpoint", request.httpEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpTokens)) {
            query.put("HttpTokens", request.httpTokens);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeCandidateOptions)) {
            query.put("InstanceTypeCandidateOptions", request.instanceTypeCandidateOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePoolOptions)) {
            query.put("ResourcePoolOptions", request.resourcePoolOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryEniVSwitchConstraint)) {
            query.put("SecondaryEniVSwitchConstraint", request.secondaryEniVSwitchConstraint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityOptions)) {
            query.put("SecurityOptions", request.securityOptions);
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
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of a scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can bind a primary network interface card (NIC) by using one of the following methods. However, you can use only one method in a single request. If you use both methods, the request fails and an error message is returned. When you modify the scaling configuration by using one method, the NIC configuration set by the other method is cleared.<ul>
     * <li>Directly configure the primary NIC by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Configure the primary NIC and secondary NICs by using the NetworkInterfaces parameter. When you use the NetworkInterfaces parameter, you must configure the primary NIC. If NetworkInterface.InstanceType is set to Primary, the primary NIC is configured. If NetworkInterface.InstanceType is set to Secondary or left empty, a secondary NIC is configured.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an ECS-type scaling configuration (the ECS instance template for scale-out) if the current scaling configuration does not meet your business requirements.</p>
     * 
     * @param request ModifyScalingConfigurationRequest
     * @return ModifyScalingConfigurationResponse
     */
    public ModifyScalingConfigurationResponse modifyScalingConfiguration(ModifyScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following parameters cannot be modified:<ul>
     * <li>RegionId.</li>
     * <li>LoadBalancerId.<blockquote>
     * <p>To modify load balancing instances, use the AttachLoadBalancers and DetachLoadBalancers operations.</p>
     * </blockquote>
     * </li>
     * <li>DBInstanceId.<blockquote>
     * <p>To modify ApsaraDB RDS instances, use the AttachDBInstances and DetachDBInstances operations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>You can call this operation only when the scaling group is in the Active or Inactive state.</li>
     * <li>Activating a new scaling configuration does not affect the running ECS instances or elastic container instances that were created by using earlier scaling configurations.</li>
     * <li>If you modify the MaxSize parameter and the number of ECS instances or elastic container instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances or elastic container instances from the scaling group until the number of instances equals the value of MaxSize.</li>
     * <li>If you modify the MinSize parameter and the number of ECS instances or elastic container instances in the scaling group is less than the value of MinSize, Auto Scaling automatically adds ECS instances or elastic container instances to the scaling group until the number of instances equals the value of MinSize.</li>
     * <li>If the DesiredCapacity parameter is configured for the scaling group and you modify the value of DesiredCapacity, and the current number of ECS instances or elastic container instances in the scaling group is different from the value of DesiredCapacity, Auto Scaling automatically adds or removes ECS instances or elastic container instances until the number of instances equals the value of DesiredCapacity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a scaling group. You can configure a scaling group to automatically adjust your computing capacity by increasing or decreasing the number of instances based on business demands and policies. If the current attributes of the scaling group no longer meet your business requirements, you can call this operation to modify attributes such as the maximum number of instances, minimum number of instances, or expected number of instances. This eliminates the need to recreate the scaling group and reconfigure related attributes, saving time and resource costs.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.autoRebalance)) {
            query.put("AutoRebalance", request.autoRebalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.balanceMode)) {
            query.put("BalanceMode", request.balanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacityOptions)) {
            query.put("CapacityOptions", request.capacityOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopInstanceTimeout)) {
            query.put("StopInstanceTimeout", request.stopInstanceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneShiftPolicy)) {
            query.put("ZoneShiftPolicy", request.zoneShiftPolicy);
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
     * <b>description</b> :
     * <ul>
     * <li>The following parameters cannot be modified:<ul>
     * <li>RegionId.</li>
     * <li>LoadBalancerId.<blockquote>
     * <p>To modify load balancing instances, use the AttachLoadBalancers and DetachLoadBalancers operations.</p>
     * </blockquote>
     * </li>
     * <li>DBInstanceId.<blockquote>
     * <p>To modify ApsaraDB RDS instances, use the AttachDBInstances and DetachDBInstances operations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>You can call this operation only when the scaling group is in the Active or Inactive state.</li>
     * <li>Activating a new scaling configuration does not affect the running ECS instances or elastic container instances that were created by using earlier scaling configurations.</li>
     * <li>If you modify the MaxSize parameter and the number of ECS instances or elastic container instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances or elastic container instances from the scaling group until the number of instances equals the value of MaxSize.</li>
     * <li>If you modify the MinSize parameter and the number of ECS instances or elastic container instances in the scaling group is less than the value of MinSize, Auto Scaling automatically adds ECS instances or elastic container instances to the scaling group until the number of instances equals the value of MinSize.</li>
     * <li>If the DesiredCapacity parameter is configured for the scaling group and you modify the value of DesiredCapacity, and the current number of ECS instances or elastic container instances in the scaling group is different from the value of DesiredCapacity, Auto Scaling automatically adds or removes ECS instances or elastic container instances until the number of instances equals the value of DesiredCapacity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a scaling group. You can configure a scaling group to automatically adjust your computing capacity by increasing or decreasing the number of instances based on business demands and policies. If the current attributes of the scaling group no longer meet your business requirements, you can call this operation to modify attributes such as the maximum number of instances, minimum number of instances, or expected number of instances. This eliminates the need to recreate the scaling group and reconfigure related attributes, saving time and resource costs.</p>
     * 
     * @param request ModifyScalingGroupRequest
     * @return ModifyScalingGroupResponse
     */
    public ModifyScalingGroupResponse modifyScalingGroup(ModifyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies one or more attributes of a scaling rule. If an existing scaling rule no longer meets your requirements, you can call this operation to modify its attributes instead of creating a new one. This avoids unnecessary repetitive operations and saves time and resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.alarmOptions)) {
            query.put("AlarmOptions", request.alarmOptions);
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

        if (!com.aliyun.teautil.Common.isUnset(request.hybridMetrics)) {
            query.put("HybridMetrics", request.hybridMetrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridMonitorNamespace)) {
            query.put("HybridMonitorNamespace", request.hybridMonitorNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
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
     * <b>summary</b> : 
     * <p>Modifies one or more attributes of a scaling rule. If an existing scaling rule no longer meets your requirements, you can call this operation to modify its attributes instead of creating a new one. This avoids unnecessary repetitive operations and saves time and resources.</p>
     * 
     * @param request ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Scheduled tasks support two scaling methods:</p>
     * <ul>
     * <li>Specify the scaling rule to execute by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of an existing scheduled task, such as the scaling rule to execute, the number of instances in the scaling group, the task execution frequency, and the retry policy.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.warmPoolCapacityOptions)) {
            query.put("WarmPoolCapacityOptions", request.warmPoolCapacityOptions);
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
     * <b>description</b> :
     * <p>Scheduled tasks support two scaling methods:</p>
     * <ul>
     * <li>Specify the scaling rule to execute by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of an existing scheduled task, such as the scaling rule to execute, the number of instances in the scaling group, the task execution frequency, and the retry policy.</p>
     * 
     * @param request ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTask(ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Warm pools are supported only for ECS scaling groups.</li>
     * <li>Warm pools are supported only when the reclaim mode of the scaling group is set to release or forcerelease.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a warm pool for a scaling group. If the scaling group does not have a warm pool, this operation creates one. If the scaling group already has a warm pool, this operation updates the configurations of the warm pool.</p>
     * 
     * @param request PutWarmPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutWarmPoolResponse
     */
    public PutWarmPoolResponse putWarmPoolWithOptions(PutWarmPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityOptions)) {
            query.put("CapacityOptions", request.capacityOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceReusePolicy)) {
            query.put("InstanceReusePolicy", request.instanceReusePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolState)) {
            query.put("PoolState", request.poolState);
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
            new TeaPair("action", "PutWarmPool"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutWarmPoolResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Warm pools are supported only for ECS scaling groups.</li>
     * <li>Warm pools are supported only when the reclaim mode of the scaling group is set to release or forcerelease.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a warm pool for a scaling group. If the scaling group does not have a warm pool, this operation creates one. If the scaling group already has a warm pool, this operation updates the configurations of the warm pool.</p>
     * 
     * @param request PutWarmPoolRequest
     * @return PutWarmPoolResponse
     */
    public PutWarmPoolResponse putWarmPool(PutWarmPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putWarmPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical monitoring data of a scaling group that uses predictive scaling rules.</p>
     * 
     * @param request QueryHistoricalMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHistoricalMetricResponse
     */
    public QueryHistoricalMetricResponse queryHistoricalMetricWithOptions(QueryHistoricalMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHistoricalMetric"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHistoricalMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical monitoring data of a scaling group that uses predictive scaling rules.</p>
     * 
     * @param request QueryHistoricalMetricRequest
     * @return QueryHistoricalMetricResponse
     */
    public QueryHistoricalMetricResponse queryHistoricalMetric(QueryHistoricalMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHistoricalMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries predictive monitoring data.</p>
     * 
     * @param request QueryPredictiveMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPredictiveMetricResponse
     */
    public QueryPredictiveMetricResponse queryPredictiveMetricWithOptions(QueryPredictiveMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPredictiveMetric"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPredictiveMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries predictive monitoring data.</p>
     * 
     * @param request QueryPredictiveMetricRequest
     * @return QueryPredictiveMetricResponse
     */
    public QueryPredictiveMetricResponse queryPredictiveMetric(QueryPredictiveMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPredictiveMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a prediction task.</p>
     * 
     * @param request QueryPredictiveTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPredictiveTaskInfoResponse
     */
    public QueryPredictiveTaskInfoResponse queryPredictiveTaskInfoWithOptions(QueryPredictiveTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPredictiveTaskInfo"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPredictiveTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a prediction task.</p>
     * 
     * @param request QueryPredictiveTaskInfoRequest
     * @return QueryPredictiveTaskInfoResponse
     */
    public QueryPredictiveTaskInfoResponse queryPredictiveTaskInfo(QueryPredictiveTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPredictiveTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the predicted number of instances in a scaling group.</p>
     * 
     * @param request QueryPredictiveValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPredictiveValueResponse
     */
    public QueryPredictiveValueResponse queryPredictiveValueWithOptions(QueryPredictiveValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPredictiveValue"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPredictiveValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the predicted number of instances in a scaling group.</p>
     * 
     * @param request QueryPredictiveValueRequest
     * @return QueryPredictiveValueResponse
     */
    public QueryPredictiveValueResponse queryPredictiveValue(QueryPredictiveValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPredictiveValueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Rebalancing compensates for unbalanced zones by creating new ECS instances to replace existing ones. New ECS instances are started before existing ones are stopped. Rebalancing does not affect the performance or availability of your applications.</p>
     * <ul>
     * <li>This operation is supported only for multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>. It is used to balance the distribution of ECS instances across multiple zones.</li>
     * <li>You can perform a rebalancing operation only when the instance distribution in the scaling group is severely unbalanced. A single rebalancing activity can replace up to 20 ECS instances.</li>
     * <li>During a rebalancing activity, if the number of instances in the scaling group approaches or reaches the specified maximum number of ECS instances (MaxSize) but the distribution still needs to be balanced, Auto Scaling allows the number of ECS instances to temporarily exceed MaxSize by 10%. This temporary excess lasts until the distribution is balanced, typically for 1 to 6 minutes. <blockquote>
     * <p>If 10% of the maximum number of instances in the scaling group is not an integer, the decimal part is rounded up to allow an excess of 1 instance. For example, if the maximum number of instances in the scaling group is 15, 10% is 1.5, and the temporary excess allowed is 2 instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebalances the distribution of ECS instances in a multi-zone scaling group if the number of instances across zones is unbalanced due to insufficient inventory or other reasons.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Rebalancing compensates for unbalanced zones by creating new ECS instances to replace existing ones. New ECS instances are started before existing ones are stopped. Rebalancing does not affect the performance or availability of your applications.</p>
     * <ul>
     * <li>This operation is supported only for multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>. It is used to balance the distribution of ECS instances across multiple zones.</li>
     * <li>You can perform a rebalancing operation only when the instance distribution in the scaling group is severely unbalanced. A single rebalancing activity can replace up to 20 ECS instances.</li>
     * <li>During a rebalancing activity, if the number of instances in the scaling group approaches or reaches the specified maximum number of ECS instances (MaxSize) but the distribution still needs to be balanced, Auto Scaling allows the number of ECS instances to temporarily exceed MaxSize by 10%. This temporary excess lasts until the distribution is balanced, typically for 1 to 6 minutes. <blockquote>
     * <p>If 10% of the maximum number of instances in the scaling group is not an integer, the decimal part is rounded up to allow an excess of 1 instance. For example, if the maximum number of instances in the scaling group is 15, 10% is 1.5, and the temporary excess allowed is 2 instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebalances the distribution of ECS instances in a multi-zone scaling group if the number of instances across zones is unbalanced due to insufficient inventory or other reasons.</p>
     * 
     * @param request RebalanceInstancesRequest
     * @return RebalanceInstancesResponse
     */
    public RebalanceInstancesResponse rebalanceInstances(RebalanceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebalanceInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to extend the wait time only when the ECS instance is suspended.
     * The wait time of an ECS instance cannot exceed 6 hours, and each wait state can be extended up to 20 times.</p>
     * 
     * <b>summary</b> : 
     * <p>Extends the suspension period of an ECS instance that is suspended after a lifecycle hook is triggered in a scaling group. If the default wait time of the suspended ECS instance is insufficient for your custom operations, you can call this operation to extend the suspension period by specifying the lifecycle hook ID, the wait state token of the scaling activity, and the new wait time.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to extend the wait time only when the ECS instance is suspended.
     * The wait time of an ECS instance cannot exceed 6 hours, and each wait state can be extended up to 20 times.</p>
     * 
     * <b>summary</b> : 
     * <p>Extends the suspension period of an ECS instance that is suspended after a lifecycle hook is triggered in a scaling group. If the default wait time of the suspended ECS instance is insufficient for your custom operations, you can call this operation to extend the suspension period by specifying the lifecycle hook ID, the wait state token of the scaling activity, and the new wait time.</p>
     * 
     * @param request RecordLifecycleActionHeartbeatRequest
     * @return RecordLifecycleActionHeartbeatResponse
     */
    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordLifecycleActionHeartbeatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is enabled (Active).</li>
     * <li>No scaling activity is being executed in the scaling group.<blockquote>
     * <p>If no scaling activity is being executed in the scaling group, this operation can bypass the cooldown time (DefaultCooldown) and be executed directly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>If an ECS instance is created through automatic creation by Auto Scaling, or was manually added and managed by the scaling group, the ECS instance triggers the economical mode or is released when you delete it from the scaling group.</li>
     * <li>If an ECS instance was manually added and is not managed by the scaling group, the ECS instance is not stopped or released when you delete it from the scaling group.</li>
     * <li>If the number of instances in the scaling group (TotalCapacity) minus the number of instances specified in this operation is less than the minimum number of instances (MinSize) in the scaling group, the request to invoke this operation fails.
     * A successful response only indicates that the Auto Scaling service has accepted the request and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must check the execution status of the scaling activity by using the returned ScalingActivityId.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more unnecessary instances from a scaling group. You can invoke the RemoveInstances API to delete instances if the scaling group is enabled and no scaling activity is being executed.</p>
     * 
     * @param tmpReq RemoveInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstancesResponse
     */
    public RemoveInstancesResponse removeInstancesWithOptions(RemoveInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveInstancesShrinkRequest request = new RemoveInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lifecycleHookContext)) {
            request.lifecycleHookContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lifecycleHookContext, "LifecycleHookContext", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookContextShrink)) {
            query.put("LifecycleHookContext", request.lifecycleHookContextShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stopInstanceTimeout)) {
            query.put("StopInstanceTimeout", request.stopInstanceTimeout);
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
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is enabled (Active).</li>
     * <li>No scaling activity is being executed in the scaling group.<blockquote>
     * <p>If no scaling activity is being executed in the scaling group, this operation can bypass the cooldown time (DefaultCooldown) and be executed directly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>If an ECS instance is created through automatic creation by Auto Scaling, or was manually added and managed by the scaling group, the ECS instance triggers the economical mode or is released when you delete it from the scaling group.</li>
     * <li>If an ECS instance was manually added and is not managed by the scaling group, the ECS instance is not stopped or released when you delete it from the scaling group.</li>
     * <li>If the number of instances in the scaling group (TotalCapacity) minus the number of instances specified in this operation is less than the minimum number of instances (MinSize) in the scaling group, the request to invoke this operation fails.
     * A successful response only indicates that the Auto Scaling service has accepted the request and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must check the execution status of the scaling activity by using the returned ScalingActivityId.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more unnecessary instances from a scaling group. You can invoke the RemoveInstances API to delete instances if the scaling group is enabled and no scaling activity is being executed.</p>
     * 
     * @param request RemoveInstancesRequest
     * @return RemoveInstancesResponse
     */
    public RemoveInstancesResponse removeInstances(RemoveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes an instance refresh task.</p>
     * 
     * @param request ResumeInstanceRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceRefreshResponse
     */
    public ResumeInstanceRefreshResponse resumeInstanceRefreshWithOptions(ResumeInstanceRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskId)) {
            query.put("InstanceRefreshTaskId", request.instanceRefreshTaskId);
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
            new TeaPair("action", "ResumeInstanceRefresh"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceRefreshResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes an instance refresh task.</p>
     * 
     * @param request ResumeInstanceRefreshRequest
     * @return ResumeInstanceRefreshResponse
     */
    public ResumeInstanceRefreshResponse resumeInstanceRefresh(ResumeInstanceRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes suspended processes in a scaling group so that the scaling group continues to execute the specified processes based on functional logic. For example, if you resume the health check process, an instance in the scaling group is automatically removed from the scaling group when it is considered unhealthy.</p>
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
     * <b>summary</b> : 
     * <p>Resumes suspended processes in a scaling group so that the scaling group continues to execute the specified processes based on functional logic. For example, if you resume the health check process, an instance in the scaling group is automatically removed from the scaling group when it is considered unhealthy.</p>
     * 
     * @param request ResumeProcessesRequest
     * @return ResumeProcessesResponse
     */
    public ResumeProcessesResponse resumeProcesses(ResumeProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeProcessesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>前提条件</h2>
     * <p>被回滚的实例刷新任务必须在启动时（调用 StartInstanceRefresh）设置了 <code>DesiredConfiguration</code> 参数。未设置 <code>DesiredConfiguration</code> 的实例刷新任务不支持回滚，调用本接口会返回 <code>UnsupportedOperation.DesiredConfiguration</code> 错误；如需回滚此类任务，请先取消该任务，再以 <code>DesiredConfiguration</code> 重新启动实例刷新后执行回滚。</p>
     * 
     * <b>summary</b> : 
     * <p>Rolls back an instance refresh task if the desired configuration does not meet your requirements during task execution. During the rollback, the system uses the active configuration of the scaling group to create new instances to replace those created based on the desired configuration.</p>
     * 
     * @param request RollbackInstanceRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackInstanceRefreshResponse
     */
    public RollbackInstanceRefreshResponse rollbackInstanceRefreshWithOptions(RollbackInstanceRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskId)) {
            query.put("InstanceRefreshTaskId", request.instanceRefreshTaskId);
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
            new TeaPair("action", "RollbackInstanceRefresh"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackInstanceRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <h2>前提条件</h2>
     * <p>被回滚的实例刷新任务必须在启动时（调用 StartInstanceRefresh）设置了 <code>DesiredConfiguration</code> 参数。未设置 <code>DesiredConfiguration</code> 的实例刷新任务不支持回滚，调用本接口会返回 <code>UnsupportedOperation.DesiredConfiguration</code> 错误；如需回滚此类任务，请先取消该任务，再以 <code>DesiredConfiguration</code> 重新启动实例刷新后执行回滚。</p>
     * 
     * <b>summary</b> : 
     * <p>Rolls back an instance refresh task if the desired configuration does not meet your requirements during task execution. During the rollback, the system uses the active configuration of the scaling group to create new instances to replace those created based on the desired configuration.</p>
     * 
     * @param request RollbackInstanceRefreshRequest
     * @return RollbackInstanceRefreshResponse
     */
    public RollbackInstanceRefreshResponse rollbackInstanceRefresh(RollbackInstanceRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackInstanceRefreshWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and directly execute a scaling activity.</li>
     * <li>If the number of ECS instances to be added specified in the scaling rule plus the current number of instances in the scaling group (Total Capacity) exceeds the maximum number of instances (MaxSize), the scaling activity is executed with Total Capacity set to MaxSize.</li>
     * <li>If the current number of instances in the scaling group (Total Capacity) minus the number of ECS instances to be removed specified in the scaling rule is less than the minimum number of instances (MinSize), the scaling activity is executed with Total Capacity set to MinSize.
     * A successful response only indicates that Auto Scaling accepted the request and can execute the scaling activity. It does not guarantee that the scaling activity will be successfully executed. You must use the returned <code>ScalingActivityId</code> to check the execution status of the scaling activity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers auto scaling based on a specified adjustment rule by calling the ScaleWithAdjustment API, eliminating the need to create a scaling rule in advance as required by the ExecuteScalingRule API.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            query.put("ExecutionMode", request.executionMode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.parallelTask)) {
            query.put("ParallelTask", request.parallelTask);
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
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and directly execute a scaling activity.</li>
     * <li>If the number of ECS instances to be added specified in the scaling rule plus the current number of instances in the scaling group (Total Capacity) exceeds the maximum number of instances (MaxSize), the scaling activity is executed with Total Capacity set to MaxSize.</li>
     * <li>If the current number of instances in the scaling group (Total Capacity) minus the number of ECS instances to be removed specified in the scaling rule is less than the minimum number of instances (MinSize), the scaling activity is executed with Total Capacity set to MinSize.
     * A successful response only indicates that Auto Scaling accepted the request and can execute the scaling activity. It does not guarantee that the scaling activity will be successfully executed. You must use the returned <code>ScalingActivityId</code> to check the execution status of the scaling activity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers auto scaling based on a specified adjustment rule by calling the ScaleWithAdjustment API, eliminating the need to create a scaling rule in advance as required by the ExecuteScalingRule API.</p>
     * 
     * @param request ScaleWithAdjustmentRequest
     * @return ScaleWithAdjustmentResponse
     */
    public ScaleWithAdjustmentResponse scaleWithAdjustment(ScaleWithAdjustmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scaleWithAdjustmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets deletion protection for a scaling group. If you enable deletion protection for a scaling group, you cannot delete the scaling group. If you disable deletion protection for a scaling group, you can directly delete the scaling group. You can call the SetGroupDeletionProtection operation to enable or disable deletion protection.</p>
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
     * <b>summary</b> : 
     * <p>Sets deletion protection for a scaling group. If you enable deletion protection for a scaling group, you cannot delete the scaling group. If you disable deletion protection for a scaling group, you can directly delete the scaling group. You can call the SetGroupDeletionProtection operation to enable or disable deletion protection.</p>
     * 
     * @param request SetGroupDeletionProtectionRequest
     * @return SetGroupDeletionProtectionResponse
     */
    public SetGroupDeletionProtectionResponse setGroupDeletionProtection(SetGroupDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGroupDeletionProtectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A scaling group detects and removes ECS instances or ECI instances that are in the unhealthy state. To retain specific ECS or ECI instances, put the instances into the standby state or protection status. For more information, see <a href="https://help.aliyun.com/document_detail/459345.html">EnterStandby</a> and <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the health status of an ECS instance or an Elastic Container Instance (ECI) in a scaling group. In some cases, automatic health checks may not accurately detect the health status of ECS or ECI instances. Manually setting the health status enables quick identification and handling of faulty instances to better meet actual business and O&amp;M requirements.</p>
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
     * <b>description</b> :
     * <p>A scaling group detects and removes ECS instances or ECI instances that are in the unhealthy state. To retain specific ECS or ECI instances, put the instances into the standby state or protection status. For more information, see <a href="https://help.aliyun.com/document_detail/459345.html">EnterStandby</a> and <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the health status of an ECS instance or an Elastic Container Instance (ECI) in a scaling group. In some cases, automatic health checks may not accurately detect the health status of ECS or ECI instances. Manually setting the health status enables quick identification and handling of faulty instances to better meet actual business and O&amp;M requirements.</p>
     * 
     * @param request SetInstanceHealthRequest
     * @return SetInstanceHealthResponse
     */
    public SetInstanceHealthResponse setInstanceHealth(SetInstanceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceHealthWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the protection status is enabled for an ECS instance:</p>
     * <ul>
     * <li>The instance remains in this state until you disable the protection status.</li>
     * <li>The protected ECS instance is not removed even if changes in the number of instances in the scaling group or monitoring tasks trigger a scaling activity for automatic scale-in. You must remove the ECS instance before you can release it. For more information, see <a href="https://help.aliyun.com/document_detail/459393.html">Remove ECS instances</a>.</li>
     * <li>The health check status of the ECS instance is not updated when the instance is stopped or restarted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets or removes the protection status for one or more ECS instances in a scaling group. After the protection feature is enabled for an ECS instance, the instance is not terminated or released during automatic scale-in of the scaling group. The instance can only be manually removed from the console or by calling the RemoveInstances operation.</p>
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
     * <b>description</b> :
     * <p>After the protection status is enabled for an ECS instance:</p>
     * <ul>
     * <li>The instance remains in this state until you disable the protection status.</li>
     * <li>The protected ECS instance is not removed even if changes in the number of instances in the scaling group or monitoring tasks trigger a scaling activity for automatic scale-in. You must remove the ECS instance before you can release it. For more information, see <a href="https://help.aliyun.com/document_detail/459393.html">Remove ECS instances</a>.</li>
     * <li>The health check status of the ECS instance is not updated when the instance is stopped or restarted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets or removes the protection status for one or more ECS instances in a scaling group. After the protection feature is enabled for an ECS instance, the instance is not terminated or released during automatic scale-in of the scaling group. The instance can only be manually removed from the console or by calling the RemoveInstances operation.</p>
     * 
     * @param request SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtection(SetInstancesProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstancesProtectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A scaling group can have only one running instance refresh node at a time.</li>
     * <li>This feature is supported only for ECS scaling groups that use the <strong>priority policy</strong> as the scale-out policy. Scaling groups that use the <strong>number of vCPUs to calculate the capacity of the scaling group</strong> and scaling groups whose instance revoke pattern is set to <strong>shutdown revoke pattern</strong> or <strong>forced shutdown revoke pattern</strong> do not support this feature.</li>
     * <li>During an instance refresh, normal scale-out and scale-in activities can be performed. However, scale-out activities use the desired configuration specified for the instance refresh.</li>
     * <li>Instances that are manually added to the scaling group, or are in the standby state or protection status are ignored by the instance refresh node and are not refreshed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the instances in a scaling group to apply a new scaling configuration or update the images of the instances.</p>
     * 
     * @param request StartInstanceRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceRefreshResponse
     */
    public StartInstanceRefreshResponse startInstanceRefreshWithOptions(StartInstanceRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpointPauseTime)) {
            query.put("CheckpointPauseTime", request.checkpointPauseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoints)) {
            query.put("Checkpoints", request.checkpoints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredConfiguration)) {
            query.put("DesiredConfiguration", request.desiredConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHealthyPercentage)) {
            query.put("MaxHealthyPercentage", request.maxHealthyPercentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHealthyPercentage)) {
            query.put("MinHealthyPercentage", request.minHealthyPercentage);
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

        if (!com.aliyun.teautil.Common.isUnset(request.skipMatching)) {
            query.put("SkipMatching", request.skipMatching);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstanceRefresh"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A scaling group can have only one running instance refresh node at a time.</li>
     * <li>This feature is supported only for ECS scaling groups that use the <strong>priority policy</strong> as the scale-out policy. Scaling groups that use the <strong>number of vCPUs to calculate the capacity of the scaling group</strong> and scaling groups whose instance revoke pattern is set to <strong>shutdown revoke pattern</strong> or <strong>forced shutdown revoke pattern</strong> do not support this feature.</li>
     * <li>During an instance refresh, normal scale-out and scale-in activities can be performed. However, scale-out activities use the desired configuration specified for the instance refresh.</li>
     * <li>Instances that are manually added to the scaling group, or are in the standby state or protection status are ignored by the instance refresh node and are not refreshed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Refreshes the instances in a scaling group to apply a new scaling configuration or update the images of the instances.</p>
     * 
     * @param request StartInstanceRefreshRequest
     * @return StartInstanceRefreshResponse
     */
    public StartInstanceRefreshResponse startInstanceRefresh(StartInstanceRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables zone fault degradation for a scaling group.</p>
     * 
     * @param request StartScalingGroupZoneShiftRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartScalingGroupZoneShiftResponse
     */
    public StartScalingGroupZoneShiftResponse startScalingGroupZoneShiftWithOptions(StartScalingGroupZoneShiftRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTime)) {
            query.put("ExpiryTime", request.expiryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.impairedZoneIds)) {
            query.put("ImpairedZoneIds", request.impairedZoneIds);
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
            new TeaPair("action", "StartScalingGroupZoneShift"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartScalingGroupZoneShiftResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables zone fault degradation for a scaling group.</p>
     * 
     * @param request StartScalingGroupZoneShiftRequest
     * @return StartScalingGroupZoneShiftResponse
     */
    public StartScalingGroupZoneShiftResponse startScalingGroupZoneShift(StartScalingGroupZoneShiftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startScalingGroupZoneShiftWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to suspend an instance refresh task that is being rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends an instance refresh task. If you are not sure that you want to roll back an ongoing instance refresh task whose configurations you think has an issue, you can call the SuspendInstanceRefresh operation to suspend the task.</p>
     * 
     * @param request SuspendInstanceRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendInstanceRefreshResponse
     */
    public SuspendInstanceRefreshResponse suspendInstanceRefreshWithOptions(SuspendInstanceRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceRefreshTaskId)) {
            query.put("InstanceRefreshTaskId", request.instanceRefreshTaskId);
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
            new TeaPair("action", "SuspendInstanceRefresh"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendInstanceRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to suspend an instance refresh task that is being rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Suspends an instance refresh task. If you are not sure that you want to roll back an ongoing instance refresh task whose configurations you think has an issue, you can call the SuspendInstanceRefresh operation to suspend the task.</p>
     * 
     * @param request SuspendInstanceRefreshRequest
     * @return SuspendInstanceRefreshResponse
     */
    public SuspendInstanceRefreshResponse suspendInstanceRefresh(SuspendInstanceRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstanceRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends scaling processes. This operation empowers you to selectively pause distinct scaling processes within a particular scaling group, enabling you to carry out alternative tasks and achieve more granular management over your scaling operations.</p>
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
     * <b>summary</b> : 
     * <p>Suspends scaling processes. This operation empowers you to selectively pause distinct scaling processes within a particular scaling group, enabling you to carry out alternative tasks and achieve more granular management over your scaling operations.</p>
     * 
     * @param request SuspendProcessesRequest
     * @return SuspendProcessesResponse
     */
    public SuspendProcessesResponse suspendProcesses(SuspendProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendProcessesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can attach up to 20 tags to a scaling group.
     *     **
     *     <strong>Note</strong> Before you attach tags to a specific Auto Scaling resource, Alibaba Cloud automatically verifies the current number of tags attached to that resource. In the event the proposed addition would exceed the maximum allowed number of tags, an error message will be promptly returned after you call this operation.</p>
     * <ul>
     * <li>If you set <code>Tags.Propagate</code> to <code>true</code>, any tags attached to your scaling group will be automatically propagated to new instances that are subsequently created in the scaling group, without affecting existing instances.</li>
     * <li>If both the scaling configuration and the scaling group have tags attached, and tag propagation from the scaling group is enabled, the tags of newly created instances comply with the following rules:<ul>
     * <li>Instances set to join the scaling group will inherit the following tags: tags attached to the scaling configuration that initiates the instance creation and tags attached to the scaling group that are allowed to propagate to these instances upon instance creation.</li>
     * <li>If the tag keys of the scaling configuration and those attached to the scaling group and propagated to the instances are identical, the tags attached to the scaling group and propagated to the instances will be overwritten by the tags of the scaling configuration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags. You can call the TagResources operation to uniformly create and attach tags to your Auto Scaling resources, streamlining resource management. This capability empowers you to categorize resources based on tags, thereby enhancing the overall efficiency of resource allocation and utilization.</p>
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
     * <b>description</b> :
     * <p>  You can attach up to 20 tags to a scaling group.
     *     **
     *     <strong>Note</strong> Before you attach tags to a specific Auto Scaling resource, Alibaba Cloud automatically verifies the current number of tags attached to that resource. In the event the proposed addition would exceed the maximum allowed number of tags, an error message will be promptly returned after you call this operation.</p>
     * <ul>
     * <li>If you set <code>Tags.Propagate</code> to <code>true</code>, any tags attached to your scaling group will be automatically propagated to new instances that are subsequently created in the scaling group, without affecting existing instances.</li>
     * <li>If both the scaling configuration and the scaling group have tags attached, and tag propagation from the scaling group is enabled, the tags of newly created instances comply with the following rules:<ul>
     * <li>Instances set to join the scaling group will inherit the following tags: tags attached to the scaling configuration that initiates the instance creation and tags attached to the scaling group that are allowed to propagate to these instances upon instance creation.</li>
     * <li>If the tag keys of the scaling configuration and those attached to the scaling group and propagated to the instances are identical, the tags attached to the scaling group and propagated to the instances will be overwritten by the tags of the scaling configuration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags. You can call the TagResources operation to uniformly create and attach tags to your Auto Scaling resources, streamlining resource management. This capability empowers you to categorize resources based on tags, thereby enhancing the overall efficiency of resource allocation and utilization.</p>
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
     * <p>Removes tags from Auto Scaling resources simultaneously. This operation streamlines resource management activities, enhances system efficiency, and mitigates potential security vulnerabilities. Once a tag is removed from a particular resource, and if it is not re-added to any other resource, the system will automatically delete the unused tag.</p>
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
     * <b>summary</b> : 
     * <p>Removes tags from Auto Scaling resources simultaneously. This operation streamlines resource management activities, enhances system efficiency, and mitigates potential security vulnerabilities. Once a tag is removed from a particular resource, and if it is not re-added to any other resource, the system will automatically delete the unused tag.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the account has the AliyunServiceRoleForAutoScaling service-linked role by calling VerifyAuthentication and specifying the Alibaba Cloud account ID. This role is used to authorize Auto Scaling to manage ECS and ECI resources.</p>
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
     * <b>summary</b> : 
     * <p>Checks whether the account has the AliyunServiceRoleForAutoScaling service-linked role by calling VerifyAuthentication and specifying the Alibaba Cloud account ID. This role is used to authorize Auto Scaling to manage ECS and ECI resources.</p>
     * 
     * @param request VerifyAuthenticationRequest
     * @return VerifyAuthenticationResponse
     */
    public VerifyAuthenticationResponse verifyAuthentication(VerifyAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyAuthenticationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies whether Auto Scaling is activated. This operation guarantees that in response to shifts in business workloads or variations in incoming traffic, the system will automatically adjust resource provisioning. This auto-scaling capability enhances the overall system performance, ensuring high availability and improved flexibility to accommodate dynamic demands.</p>
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
     * <b>summary</b> : 
     * <p>Verifies whether Auto Scaling is activated. This operation guarantees that in response to shifts in business workloads or variations in incoming traffic, the system will automatically adjust resource provisioning. This auto-scaling capability enhances the overall system performance, ensuring high availability and improved flexibility to accommodate dynamic demands.</p>
     * 
     * @param request VerifyUserRequest
     * @return VerifyUserResponse
     */
    public VerifyUserResponse verifyUser(VerifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyUserWithOptions(request, runtime);
    }
}
