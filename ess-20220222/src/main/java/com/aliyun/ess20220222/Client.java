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
     * <b>description</b> :
     * <p>Before you use a YAML configuration file to manage scaling configurations of the Elastic Container Instance type, you must take note of the following items:</p>
     * <ul>
     * <li>If you include a scaling configuration ID within your request, the system updates the scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not include a scaling configuration ID within your request, the system creates a scaling configuration of the Elastic Container Instance type based on the YAML configuration file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies a scaling configuration of the Elastic Container Instance type. If you want to create and manage scaling configurations of the Elastic Container Instance type by using a configuration file, you can call the ApplyEciScalingConfiguration operation.</p>
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
     * <p>Before you use a YAML configuration file to manage scaling configurations of the Elastic Container Instance type, you must take note of the following items:</p>
     * <ul>
     * <li>If you include a scaling configuration ID within your request, the system updates the scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not include a scaling configuration ID within your request, the system creates a scaling configuration of the Elastic Container Instance type based on the YAML configuration file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies a scaling configuration of the Elastic Container Instance type. If you want to create and manage scaling configurations of the Elastic Container Instance type by using a configuration file, you can call the ApplyEciScalingConfiguration operation.</p>
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
     * <p>You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see &quot;Supported annotations&quot; in this topic.
     * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s_default_Deployment_nginx.
     * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:</p>
     * <ul>
     * <li>If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.</li>
     * <li>If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ol>
     * <li>If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.</li>
     * <li>If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.</li>
     * <li>After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>For more information about annotations, see <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Annotation</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum size of the scaling group that you want to create. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The IP address of the Network Time Protocol (NTP) server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The specifications of 2 vCPUs and 4 GB memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create pods by specifying multiple specifications</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c\<em>\</em>\<em>\</em></td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv\<em>\</em>\<em>\</em></td>
     * <td>The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>If you set the value to false, the log collection feature is disabled.</td>
     * </tr>
     * <tr>
     * <td>If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for the preemptible instance. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price of the preemptible instance. This value can be accurate to up to three decimal places.</td>
     * </tr>
     * <tr>
     * <td>This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>If you set the value to true, an EIP is automatically created and bound to each elastic container instance.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of the specified DataCache. If you want to use a DataCache to create a pod, you must configure this annotation.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk that you want to create by using the specified DataCache.</td>
     * </tr>
     * <tr>
     * <td>By default, enhanced SSDs (ESSDs) are created. Default value: PL1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>基于yaml配置进行弹性伸缩管理</p>
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
     * <p>You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see &quot;Supported annotations&quot; in this topic.
     * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s_default_Deployment_nginx.
     * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:</p>
     * <ul>
     * <li>If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.</li>
     * <li>If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ol>
     * <li>If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.</li>
     * <li>If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.</li>
     * <li>After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>For more information about annotations, see <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Annotation</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum size of the scaling group that you want to create. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The IP address of the Network Time Protocol (NTP) server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The specifications of 2 vCPUs and 4 GB memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create pods by specifying multiple specifications</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c\<em>\</em>\<em>\</em></td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv\<em>\</em>\<em>\</em></td>
     * <td>The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>If you set the value to false, the log collection feature is disabled.</td>
     * </tr>
     * <tr>
     * <td>If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for the preemptible instance. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price of the preemptible instance. This value can be accurate to up to three decimal places.</td>
     * </tr>
     * <tr>
     * <td>This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>If you set the value to true, an EIP is automatically created and bound to each elastic container instance.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of the specified DataCache. If you want to use a DataCache to create a pod, you must configure this annotation.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk that you want to create by using the specified DataCache.</td>
     * </tr>
     * <tr>
     * <td>By default, enhanced SSDs (ESSDs) are created. Default value: PL1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>基于yaml配置进行弹性伸缩管理</p>
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
     * <p>Before you call the operation to attach an ALB server group to your scaling group, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The scaling group and the ALB server group share the same virtual private cloud (VPC).</li>
     * <li>The ALB server group is in the Available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches Application Load Balancer (ALB) server groups to a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the AttachAlbServerGroups operation. By attaching ALB server groups to your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>Before you call the operation to attach an ALB server group to your scaling group, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The scaling group and the ALB server group share the same virtual private cloud (VPC).</li>
     * <li>The ALB server group is in the Available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches Application Load Balancer (ALB) server groups to a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the AttachAlbServerGroups operation. By attaching ALB server groups to your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</p>
     * <ul>
     * <li>The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.</li>
     * <li>The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see <a href="https://help.aliyun.com/document_detail/41872.html">ApsaraDB RDS usage notes</a>.</li>
     * <li>The ApsaraDB RDS instance must be in the Running state.
     * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Set the whitelist</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates one or more ApsaraDB RDS instances with a scaling group.</p>
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
     * <p>Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</p>
     * <ul>
     * <li>The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.</li>
     * <li>The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see <a href="https://help.aliyun.com/document_detail/41872.html">ApsaraDB RDS usage notes</a>.</li>
     * <li>The ApsaraDB RDS instance must be in the Running state.
     * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Set the whitelist</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates one or more ApsaraDB RDS instances with a scaling group.</p>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:</li>
     * <li>The instances reside in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances are not added to other scaling groups.</li>
     * <li>The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.</li>
     * <li>If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.</li>
     * <li>If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
     * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
     * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds instances to a scaling group to provide services or restarts Elastic Compute Service (ECS) instances stopped in Economical Mode to provide services. You can call the AttachInstances operation to add ECS instances, elastic container instances, or third-party instances managed by Alibaba Cloud to your scaling group to provide services. You can also call this operation to restart ECS instances stopped in Economical Mode in your scaling group to provide services.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:</li>
     * <li>The instances reside in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances are not added to other scaling groups.</li>
     * <li>The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.</li>
     * <li>If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.</li>
     * <li>If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
     * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
     * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds instances to a scaling group to provide services or restarts Elastic Compute Service (ECS) instances stopped in Economical Mode to provide services. You can call the AttachInstances operation to add ECS instances, elastic container instances, or third-party instances managed by Alibaba Cloud to your scaling group to provide services. You can also call this operation to restart ECS instances stopped in Economical Mode in your scaling group to provide services.</p>
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
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The load balancer and the scaling group belong to the same Alibaba Cloud account and region.</li>
     * <li>The load balancer is in the <code>Running</code> state.</li>
     * <li>At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.</li>
     * <li>If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.</li>
     * <li>If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.</li>
     * <li>The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches load balancers to a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups. Load balancers help distribute the access traffic to the instances in scaling groups, which effectively improves the service performance of the scaling groups. You can call the AttachLoadBalancers operation to attach one or more load balancers to your scaling group.</p>
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
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The load balancer and the scaling group belong to the same Alibaba Cloud account and region.</li>
     * <li>The load balancer is in the <code>Running</code> state.</li>
     * <li>At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.</li>
     * <li>If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.</li>
     * <li>If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.</li>
     * <li>The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches load balancers to a scaling group. Auto Scaling supports the attachment of load balancers to scaling groups. Load balancers help distribute the access traffic to the instances in scaling groups, which effectively improves the service performance of the scaling groups. You can call the AttachLoadBalancers operation to attach one or more load balancers to your scaling group.</p>
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
     * <p>Attaches server groups to a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the AttachServerGroups operation. By attaching Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>Attaches server groups to a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the AttachServerGroups operation. By attaching Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The CLB instance and the scaling group belong to the same Alibaba Cloud account.
     *     *   The CLB instance and the scaling group reside in the same region.
     *     *   The CLB instance is in the Running state.
     *     *   The CLB instance is configured with at least one listener. The health check feature is enabled for the CLB instance.
     *     *   If the network type of both the CLB instance and the scaling group is virtual private cloud (VPC), they use the same VPC.
     *     *   If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, any backend server of the CLB instance within a VPC setup shares the same VPC as the scaling group.
     *     *   The vServer groups that you want to attach to the scaling group belong to the CLB instance.
     *     *   The operation to attach vServer groups does not result in the total number of vServer groups exceeding the predefined quota limit. For information about the vServer group quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</p>
     * <ul>
     * <li>When you call this operation to attach vServer groups, you must specify the following parameters:<ul>
     * <li>LoadBalancerId: the ID of the CLB instance</li>
     * <li>VServerGroupId: the ID of the vServer group</li>
     * <li>Port: the port number of the vServer group
     * **
     * <strong>Note</strong> If you attempt to attach the same vServer group to a scaling group multiple times over the identical port, the system regards each attempt as a separate vServer group attachment to the scaling group. In your request, if you include the same vServer group ID coupled with the same port number multiple times, only the first configuration of the vServer group and port number pairing is considered valid. Subsequent vServer group and port number parings are disregarded.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches vServer groups to a scaling group. After a Classic Load Balancer (CLB) instance is attached to your scaling group, the instances in the scaling group are automatically added as backend servers of the CLB instance. These servers then handle requests forwarded by the CLB instance, streamlining the processing of incoming traffic. To direct varying access requests to separate backend servers or to distribute requests based on domain names or URLs, you can call the AttachVServerGroups operation. This operation enables the addition of multiple vServer groups, allowing for efficient management of various backend server configurations tailored to your routing preferences.</p>
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
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The CLB instance and the scaling group belong to the same Alibaba Cloud account.
     *     *   The CLB instance and the scaling group reside in the same region.
     *     *   The CLB instance is in the Running state.
     *     *   The CLB instance is configured with at least one listener. The health check feature is enabled for the CLB instance.
     *     *   If the network type of both the CLB instance and the scaling group is virtual private cloud (VPC), they use the same VPC.
     *     *   If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, any backend server of the CLB instance within a VPC setup shares the same VPC as the scaling group.
     *     *   The vServer groups that you want to attach to the scaling group belong to the CLB instance.
     *     *   The operation to attach vServer groups does not result in the total number of vServer groups exceeding the predefined quota limit. For information about the vServer group quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</p>
     * <ul>
     * <li>When you call this operation to attach vServer groups, you must specify the following parameters:<ul>
     * <li>LoadBalancerId: the ID of the CLB instance</li>
     * <li>VServerGroupId: the ID of the vServer group</li>
     * <li>Port: the port number of the vServer group
     * **
     * <strong>Note</strong> If you attempt to attach the same vServer group to a scaling group multiple times over the identical port, the system regards each attempt as a separate vServer group attachment to the scaling group. In your request, if you include the same vServer group ID coupled with the same port number multiple times, only the first configuration of the vServer group and port number pairing is considered valid. Subsequent vServer group and port number parings are disregarded.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches vServer groups to a scaling group. After a Classic Load Balancer (CLB) instance is attached to your scaling group, the instances in the scaling group are automatically added as backend servers of the CLB instance. These servers then handle requests forwarded by the CLB instance, streamlining the processing of incoming traffic. To direct varying access requests to separate backend servers or to distribute requests based on domain names or URLs, you can call the AttachVServerGroups operation. This operation enables the addition of multiple vServer groups, allowing for efficient management of various backend server configurations tailored to your routing preferences.</p>
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
     * <p>  A resource is an entity of cloud services that you create on Alibaba Cloud. For example, a scaling group is a resource.</p>
     * <ul>
     * <li>A resource group serves as a powerful organizational tool within your Alibaba Cloud account, enabling you to manage and monitor multiple resources collectively. It effectively addresses complexities surrounding resource categorization and permission control under a single Alibaba Cloud account, thereby enhancing management efficiency and control. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes a resource group. Resource groups are a means to categorize and manage cloud resources, such as scaling groups, based on specific objectives, permissions, or ownership. In large, multifaceted organizations that manage numerous projects and users, this feature adopts a tiered management approach, simplifying management tasks and improving the effectiveness and oversight of resource allocation. You can call the ChangeResourceGroup operation to move your scaling groups from one resource group to another resource group, which facilitates streamlined monitoring and management within the context of the new group. This operation eliminates the need for repetitive and time-consuming cross-service resource queries, thereby enhancing operational efficiency.</p>
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
     * <p>  A resource is an entity of cloud services that you create on Alibaba Cloud. For example, a scaling group is a resource.</p>
     * <ul>
     * <li>A resource group serves as a powerful organizational tool within your Alibaba Cloud account, enabling you to manage and monitor multiple resources collectively. It effectively addresses complexities surrounding resource categorization and permission control under a single Alibaba Cloud account, thereby enhancing management efficiency and control. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes a resource group. Resource groups are a means to categorize and manage cloud resources, such as scaling groups, based on specific objectives, permissions, or ownership. In large, multifaceted organizations that manage numerous projects and users, this feature adopts a tiered management approach, simplifying management tasks and improving the effectiveness and oversight of resource allocation. You can call the ChangeResourceGroup operation to move your scaling groups from one resource group to another resource group, which facilitates streamlined monitoring and management within the context of the new group. This operation eliminates the need for repetitive and time-consuming cross-service resource queries, thereby enhancing operational efficiency.</p>
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
     * <p>When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.</p>
     * 
     * <b>summary</b> : 
     * <p>Ends the timeout period of a lifecycle hook ahead of schedule. If you have created a lifecycle hook for your scaling group, you can call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule based on your business requirements.</p>
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
     * <p>When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.</p>
     * 
     * <b>summary</b> : 
     * <p>Ends the timeout period of a lifecycle hook ahead of schedule. If you have created a lifecycle hook for your scaling group, you can call the CompleteLifecycleAction operation to end the timeout period of the lifecycle hook ahead of schedule based on your business requirements.</p>
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
     * <p>  If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks of the custom monitoring type</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify MetricName, Dimensions.DimensionKey, and Dimensions.DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify user_id and scaling_group for an event-triggered task to aggregate monitoring data of all ECS instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you create an event-triggered task of the custom monitoring type, you can specify only custom metrics in the task.</li>
     * <li>If you create an event-triggered task of the system monitoring type, you can specify the system metrics described in <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a> in the task.<blockquote>
     * <p> user_id and scaling_group are automatically populated. You need to only specify device and state. For more information, see <code>Dimensions.DimensionKey</code> and <code>Dimensions.DimensionValue</code> in the &quot;Request parameters&quot; section of this topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates event-triggered tasks. If your business encounters unexpected traffic surges or has no specific patterns, you can call the CreateAlarm operation to create an event-triggered task and associate a CloudMonitor metric with the task. This allows you to dynamically adjust the number of Elastic Compute Service (ECS) instances or elastic container instances in your scaling group and keep updated on the real-time metric data, which facilitates cloud resource management and maintenance.</p>
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
     * <p>  If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks of the custom monitoring type</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify MetricName, Dimensions.DimensionKey, and Dimensions.DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify user_id and scaling_group for an event-triggered task to aggregate monitoring data of all ECS instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you create an event-triggered task of the custom monitoring type, you can specify only custom metrics in the task.</li>
     * <li>If you create an event-triggered task of the system monitoring type, you can specify the system metrics described in <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a> in the task.<blockquote>
     * <p> user_id and scaling_group are automatically populated. You need to only specify device and state. For more information, see <code>Dimensions.DimensionKey</code> and <code>Dimensions.DimensionValue</code> in the &quot;Request parameters&quot; section of this topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates event-triggered tasks. If your business encounters unexpected traffic surges or has no specific patterns, you can call the CreateAlarm operation to create an event-triggered task and associate a CloudMonitor metric with the task. This allows you to dynamically adjust the number of Elastic Compute Service (ECS) instances or elastic container instances in your scaling group and keep updated on the real-time metric data, which facilitates cloud resource management and maintenance.</p>
     * 
     * @param request CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlarmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
     * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling configuration of the Elastic Container Instance type. Auto Scaling uses the scaling configuration as a template to create elastic container instances to meet your business requirements during scale-outs.</p>
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
     * <b>description</b> :
     * <p>A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
     * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling configuration of the Elastic Container Instance type. Auto Scaling uses the scaling configuration as a template to create elastic container instances to meet your business requirements during scale-outs.</p>
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
     * <p>You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
     * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
     * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more lifecycle hooks in a scaling group. A lifecycle hook allows you to execute custom actions like sending notifications or automating script execution at critical stages (such as instance startup and termination) in the lifecycle of an instance. Implementing the lifecycle hook feature allows for finer control and management of instances. For example, you can verify configurations, set up custom tasks, or back up data on your instances when lifecycle hooks take effect, thus enhancing the flexibility and reliability of application deployment.</p>
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
     * <b>description</b> :
     * <p>You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
     * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
     * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more lifecycle hooks in a scaling group. A lifecycle hook allows you to execute custom actions like sending notifications or automating script execution at critical stages (such as instance startup and termination) in the lifecycle of an instance. Implementing the lifecycle hook feature allows for finer control and management of instances. For example, you can verify configurations, set up custom tasks, or back up data on your instances when lifecycle hooks take effect, thus enhancing the flexibility and reliability of application deployment.</p>
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
     * <h2>Description</h2>
     * <p>You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a notification rule. You can call the CreateNotificationConfiguration operation to create a notification rule to stay informed about scaling events or resource changes. This helps you learn about the dynamic status of your scaling group in real time and further automates the management of scaling events.</p>
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a notification rule. You can call the CreateNotificationConfiguration operation to create a notification rule to stay informed about scaling events or resource changes. This helps you learn about the dynamic status of your scaling group in real time and further automates the management of scaling events.</p>
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
     * <p>Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:</p>
     * <ul>
     * <li>InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.</li>
     * <li>InstanceType: In this mode, you must specify one instance type.</li>
     * <li>InstanceTypes: In this mode, you can specify more than one instance type.</li>
     * <li>InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.</li>
     * <li>Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling configuration.</p>
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
     * <b>description</b> :
     * <p>Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:</p>
     * <ul>
     * <li>InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.</li>
     * <li>InstanceType: In this mode, you must specify one instance type.</li>
     * <li>InstanceTypes: In this mode, you can specify more than one instance type.</li>
     * <li>InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.</li>
     * <li>Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling configuration.</p>
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
     * <p>A scaling group is a group of Elastic Compute Service (ECS) instances that can be used for similar purposes.
     * You can create only a limited number of scaling groups in a region. To check the quota of the scaling groups, go to Quota Center.
     * A scaling group does not immediately take effect after you create the scaling group. You can call the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable a scaling group. You can trigger scaling events and execute scaling rules only in scaling groups that are in the Enabled state.
     * If you want to attach a Classic Load Balancer (CLB, formerly known as SLB) instance and an ApsaraDB RDS instance to the scaling group that you want to create, the scaling group, the CLB instance, and the ApsaraDB RDS instance must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you attach a CLB instance to the scaling group that you want to create, Auto Scaling will automatically add the ECS instances in the scaling group to the backend server groups of the CLB instance. You can specify the following types of server groups to add ECS instances:</p>
     * <ul>
     * <li>Default server group: ECS instances in this group process frontend requests. If no listeners are configured for vServer groups or primary/secondary server groups, the frontend requests are forwarded to the ECS instances in the default server group.</li>
     * <li>vServer group: If you want to forward different requests to different backend servers, or you want to forward requests based on domain names and URLs, you can specify vServer groups.<blockquote>
     * <p> If you specify both the default server group and multiple server groups simultaneously, Auto Scaling will add the ECS instances in your scaling group to these server groups concurrently.
     * The default weight of each ECS instance as a backend server is 50. If you want to attach a CLB instance to the scaling group that you want to create, make sure that the CLB instance meets the following requirements:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance is in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to query the status of CLB instances.</li>
     * <li>Health check must be enabled on all listener ports configured for the CLB instance. Otherwise, the scaling group will fail to be created.
     * If you attach Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to the scaling group that you want to create, Auto Scaling will add the ECS instances in your scaling group to the ALB or NLB server groups to process the access requests forwarded by the corresponding ALB or NLB instances. You can attach multiple ALB or NLB server groups to a scaling group. Make sure that the ALB or NLB server groups belong to the same virtual private cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600559.html">AttachServerGroups</a>.
     * If you attach an ApsaraDB RDS instance to the scaling group that you want to create, Auto Scaling will automatically add the private IP addresses of the ECS instances in your scaling group to the IP address whitelist of the ApsaraDB RDS instance. Before you attach an ApsaraDB RDS instance to your scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</li>
     * <li>The ApsaraDB RDS instance is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> state to query the status of ApsaraDB RDS instances.</li>
     * <li>The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance does not reach its upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a>.
     * If you set MultiAZPolicy for the scaling group that you want to create to COST_OPTIMIZED, the following rules apply:</li>
     * <li>If you use OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools to specify the instance allocation mode under the cost optimization policy, Auto Scaling will prioritize the implementation of the specified instance allocation mode during scale-out events.</li>
     * <li>If you do not specify OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools, Auto Scaling will preferentially create instances of the lowest-priced instance type based on the cost optimization policy.
     * If you set <code>Tags.Propagate</code> to true, the following rules will apply:</li>
     * <li>Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.</li>
     * <li>If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.</li>
     * <li>If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling group. You can call the CreateScalingGroup operation to automate the adjustment of computing power of a specific type based on your business requirements and scaling polices.</p>
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
     * <b>description</b> :
     * <p>A scaling group is a group of Elastic Compute Service (ECS) instances that can be used for similar purposes.
     * You can create only a limited number of scaling groups in a region. To check the quota of the scaling groups, go to Quota Center.
     * A scaling group does not immediately take effect after you create the scaling group. You can call the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable a scaling group. You can trigger scaling events and execute scaling rules only in scaling groups that are in the Enabled state.
     * If you want to attach a Classic Load Balancer (CLB, formerly known as SLB) instance and an ApsaraDB RDS instance to the scaling group that you want to create, the scaling group, the CLB instance, and the ApsaraDB RDS instance must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you attach a CLB instance to the scaling group that you want to create, Auto Scaling will automatically add the ECS instances in the scaling group to the backend server groups of the CLB instance. You can specify the following types of server groups to add ECS instances:</p>
     * <ul>
     * <li>Default server group: ECS instances in this group process frontend requests. If no listeners are configured for vServer groups or primary/secondary server groups, the frontend requests are forwarded to the ECS instances in the default server group.</li>
     * <li>vServer group: If you want to forward different requests to different backend servers, or you want to forward requests based on domain names and URLs, you can specify vServer groups.<blockquote>
     * <p> If you specify both the default server group and multiple server groups simultaneously, Auto Scaling will add the ECS instances in your scaling group to these server groups concurrently.
     * The default weight of each ECS instance as a backend server is 50. If you want to attach a CLB instance to the scaling group that you want to create, make sure that the CLB instance meets the following requirements:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance is in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to query the status of CLB instances.</li>
     * <li>Health check must be enabled on all listener ports configured for the CLB instance. Otherwise, the scaling group will fail to be created.
     * If you attach Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to the scaling group that you want to create, Auto Scaling will add the ECS instances in your scaling group to the ALB or NLB server groups to process the access requests forwarded by the corresponding ALB or NLB instances. You can attach multiple ALB or NLB server groups to a scaling group. Make sure that the ALB or NLB server groups belong to the same virtual private cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600559.html">AttachServerGroups</a>.
     * If you attach an ApsaraDB RDS instance to the scaling group that you want to create, Auto Scaling will automatically add the private IP addresses of the ECS instances in your scaling group to the IP address whitelist of the ApsaraDB RDS instance. Before you attach an ApsaraDB RDS instance to your scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</li>
     * <li>The ApsaraDB RDS instance is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> state to query the status of ApsaraDB RDS instances.</li>
     * <li>The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance does not reach its upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a>.
     * If you set MultiAZPolicy for the scaling group that you want to create to COST_OPTIMIZED, the following rules apply:</li>
     * <li>If you use OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools to specify the instance allocation mode under the cost optimization policy, Auto Scaling will prioritize the implementation of the specified instance allocation mode during scale-out events.</li>
     * <li>If you do not specify OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools, Auto Scaling will preferentially create instances of the lowest-priced instance type based on the cost optimization policy.
     * If you set <code>Tags.Propagate</code> to true, the following rules will apply:</li>
     * <li>Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.</li>
     * <li>If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.</li>
     * <li>If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling group. You can call the CreateScalingGroup operation to automate the adjustment of computing power of a specific type based on your business requirements and scaling polices.</p>
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
     * <p>A scaling rule defines the specific scaling action. For example, you can use a scaling rule to define N instances to add or remove. If the execution of a scaling rule causes the total number of Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to drop below the value of MinSize or to exceed the value of MaxSize, Auto Scaling adjusts the number of instances to add or remove, which ensures that the total number of instances stays within the valid range. Take note that Auto Scaling does not adjust the number of instances that you defined in the scaling rule. Examples:</p>
     * <ul>
     * <li>The maximum number of instances (MaxSize) that can be contained in a scaling group is 3 and the current number of instances (Total Capacity) in the scaling group is 2. In this example, the Add3 scaling rule is created to add three ECS instances to the scaling group. However, after you execute Add3, Auto Scaling adds only one ECS instance to the scaling group. In addition, the number of ECS instances to add in the Add3 scaling rule remains unchanged.</li>
     * <li>The minimum number of instances (MinSize) that must be contained in a scaling group is 2 and the current number of instances (Total Capacity) is 3. In this example, the Remove5 scaling rule is created to remove five ECS instances from the scaling group. However, after you execute Remove5, Auto Scaling only removes one ECS instance from the scaling group. In addition, the number of ECS instances to remove in the Remove5 scaling rule remains unchanged.
     * Before you call this operation, take note of the following items:</li>
     * <li>If you set AdjustmentType to TotalCapacity, the total number of ECS instances or elastic container instances in your scaling group will be adjusted to a specified number when the scaling rule that you create by calling this operation is executed. You must set AdjustmentValue to an integer that is greater than 0.</li>
     * <li>If you set AdjustmentType to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be added to your scaling group, and a negative value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be removed from the scaling group.</li>
     * <li>If you set AdjustmentType to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or elastic container instances to add or remove by multiplying the current capacity of the scaling group (Total Capacity) by AdjustmentValue divided by 100, rounding off the result to determine the final adjustment count.</li>
     * <li>If you specify a cooldown period for a scaling rule, the cooldown period of the scaling rule takes effect after you execute the scaling rule. If you do not specify a cooldown period for a scaling rule, the value of DefaultCooldown of the scaling group takes effect after you execute the scaling rule.</li>
     * <li>You can create only a limited number of scaling rules for a scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The following API operations may use the unique identifier of a scaling rule (ScalingRuleAri) that is returned after you call the CreateScalingRule operation:<ul>
     * <li>ExecuteScalingRule: You can call this operation to manually execute a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to execute.</li>
     * <li>CreateScheduledTask: You can call this operation to create a scheduled task for a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule for which you want to create a scheduled task.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling rule. The purpose of a scaling rule varies based on its type. You can use a scaling rule to trigger a scaling activity or adjust the boundary values for a scaling group. You can call the CreateScalingRule operation to create different types of scaling rules based on your business requirements. For example, if your business requires only automatic adjustment of the boundary values for your scaling group, you can call this operation to create a predictive scaling rule.</p>
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
     * <b>description</b> :
     * <p>A scaling rule defines the specific scaling action. For example, you can use a scaling rule to define N instances to add or remove. If the execution of a scaling rule causes the total number of Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to drop below the value of MinSize or to exceed the value of MaxSize, Auto Scaling adjusts the number of instances to add or remove, which ensures that the total number of instances stays within the valid range. Take note that Auto Scaling does not adjust the number of instances that you defined in the scaling rule. Examples:</p>
     * <ul>
     * <li>The maximum number of instances (MaxSize) that can be contained in a scaling group is 3 and the current number of instances (Total Capacity) in the scaling group is 2. In this example, the Add3 scaling rule is created to add three ECS instances to the scaling group. However, after you execute Add3, Auto Scaling adds only one ECS instance to the scaling group. In addition, the number of ECS instances to add in the Add3 scaling rule remains unchanged.</li>
     * <li>The minimum number of instances (MinSize) that must be contained in a scaling group is 2 and the current number of instances (Total Capacity) is 3. In this example, the Remove5 scaling rule is created to remove five ECS instances from the scaling group. However, after you execute Remove5, Auto Scaling only removes one ECS instance from the scaling group. In addition, the number of ECS instances to remove in the Remove5 scaling rule remains unchanged.
     * Before you call this operation, take note of the following items:</li>
     * <li>If you set AdjustmentType to TotalCapacity, the total number of ECS instances or elastic container instances in your scaling group will be adjusted to a specified number when the scaling rule that you create by calling this operation is executed. You must set AdjustmentValue to an integer that is greater than 0.</li>
     * <li>If you set AdjustmentType to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be added to your scaling group, and a negative value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be removed from the scaling group.</li>
     * <li>If you set AdjustmentType to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or elastic container instances to add or remove by multiplying the current capacity of the scaling group (Total Capacity) by AdjustmentValue divided by 100, rounding off the result to determine the final adjustment count.</li>
     * <li>If you specify a cooldown period for a scaling rule, the cooldown period of the scaling rule takes effect after you execute the scaling rule. If you do not specify a cooldown period for a scaling rule, the value of DefaultCooldown of the scaling group takes effect after you execute the scaling rule.</li>
     * <li>You can create only a limited number of scaling rules for a scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The following API operations may use the unique identifier of a scaling rule (ScalingRuleAri) that is returned after you call the CreateScalingRule operation:<ul>
     * <li>ExecuteScalingRule: You can call this operation to manually execute a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to execute.</li>
     * <li>CreateScheduledTask: You can call this operation to create a scheduled task for a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule for which you want to create a scheduled task.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling rule. The purpose of a scaling rule varies based on its type. You can use a scaling rule to trigger a scaling activity or adjust the boundary values for a scaling group. You can call the CreateScalingRule operation to create different types of scaling rules based on your business requirements. For example, if your business requires only automatic adjustment of the boundary values for your scaling group, you can call this operation to create a predictive scaling rule.</p>
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
     * <p>  If the scaling rule of a scheduled task fails to be executed due to an ongoing scaling activity in the scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the time window specified by <code>LaunchExpirationTime</code>. If the scheduled task still fails after the specified time window ends, the task is automatically skipped.</p>
     * <ul>
     * <li>If several scheduled tasks concurrently attempt to execute the same scaling rule within a scaling group, the following rules apply:<ul>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> configured: The scaling activities incurred by the scheduled tasks are parallel scaling activities. In a proximate time window, Auto Scaling can trigger several scheduled tasks and then execute multiple parallel scaling activities at the same time.</li>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> not configured: The scaling activity incurred by the earliest scheduled task is executed. Considering that a scaling group allows for no more than one ongoing scaling activity simultaneously, other scheduled tasks will spontaneously invoke retries within the time window specified by <code>LaunchExpirationTime</code>. Upon completion of the first scheduled task, any retries invoked by other tasks within the time window specified by <code>LaunchExpirationTime</code> lead to continuous enforcement of the scaling rule, with each iteration generating a distinct scaling activity.</li>
     * </ul>
     * </li>
     * <li>You can use one of the following methods to specify the scaling mode:<ul>
     * <li>ScheduledAction: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.</li>
     * <li>ScalingGroupId: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you create the scheduled task.
     * **
     * <strong>Note</strong> You cannot specify ScheduledAction and ScalingGroupId at the same time.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task. A scheduled task is a type of scaling task that enables automatic execution of a specific scaling rule at a specified point in time. You can call the CreateScheduledTask operation to create a scheduled task to implement automatic scaling of computing resources. This ensures your business continuity and minimizes resource costs.</p>
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
     * <b>description</b> :
     * <p>  If the scaling rule of a scheduled task fails to be executed due to an ongoing scaling activity in the scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the time window specified by <code>LaunchExpirationTime</code>. If the scheduled task still fails after the specified time window ends, the task is automatically skipped.</p>
     * <ul>
     * <li>If several scheduled tasks concurrently attempt to execute the same scaling rule within a scaling group, the following rules apply:<ul>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> configured: The scaling activities incurred by the scheduled tasks are parallel scaling activities. In a proximate time window, Auto Scaling can trigger several scheduled tasks and then execute multiple parallel scaling activities at the same time.</li>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> not configured: The scaling activity incurred by the earliest scheduled task is executed. Considering that a scaling group allows for no more than one ongoing scaling activity simultaneously, other scheduled tasks will spontaneously invoke retries within the time window specified by <code>LaunchExpirationTime</code>. Upon completion of the first scheduled task, any retries invoked by other tasks within the time window specified by <code>LaunchExpirationTime</code> lead to continuous enforcement of the scaling rule, with each iteration generating a distinct scaling activity.</li>
     * </ul>
     * </li>
     * <li>You can use one of the following methods to specify the scaling mode:<ul>
     * <li>ScheduledAction: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.</li>
     * <li>ScalingGroupId: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you create the scheduled task.
     * **
     * <strong>Note</strong> You cannot specify ScheduledAction and ScalingGroupId at the same time.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task. A scheduled task is a type of scaling task that enables automatic execution of a specific scaling rule at a specified point in time. You can call the CreateScheduledTask operation to create a scheduled task to implement automatic scaling of computing resources. This ensures your business continuity and minimizes resource costs.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to deactivate a scaling configuration only in a disabled scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deactivates a scaling configuration.</p>
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
     * <b>description</b> :
     * <p>  You can call this operation to deactivate a scaling configuration only in a disabled scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deactivates a scaling configuration.</p>
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
     * <p>Queries event-triggered tasks. You can call the DescribeAlarms operation to learn about the configurations of event-triggered tasks and keep updated on monitoring data changes. This helps you troubleshoot system resource issues at the earliest opportunity and ensures system stability and reliability.</p>
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
     * <p>Queries event-triggered tasks. You can call the DescribeAlarms operation to learn about the configurations of event-triggered tasks and keep updated on monitoring data changes. This helps you troubleshoot system resource issues at the earliest opportunity and ensures system stability and reliability.</p>
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
     * <p>Queries the status of scaling activities that prompt text message or email notifications.</p>
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
     * <p>Queries the status of scaling activities that prompt text message or email notifications.</p>
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
     * <p>Queries the details of a scaling configuration. You can query a scaling configuration by its ID to learn about its details such as the temporary storage size, number of IPv6 addresses, and bandwidth of the elastic IP address (EIP). The scaling configuration details can be obtained as a YAML file.</p>
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
     * <p>Queries the details of a scaling configuration. You can query a scaling configuration by its ID to learn about its details such as the temporary storage size, number of IPv6 addresses, and bandwidth of the elastic IP address (EIP). The scaling configuration details can be obtained as a YAML file.</p>
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
     * <p>Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances.</p>
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
     * <p>Queries scaling configurations of the Elastic Container Instance type to learn the scaling configuration details. This allows you to select an appropriate template when you create elastic container instances.</p>
     * 
     * @param request DescribeEciScalingConfigurationsRequest
     * @return DescribeEciScalingConfigurationsResponse
     */
    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationsWithOptions(request, runtime);
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
     * <p>Queries the details of a lifecycle hook. If you want to query the details of a lifecycle hook, you can call the DescribeLifecycleActions operation. For example, you can query the execution status and ID of a lifecycle hook, along with the Elastic Compute Service (ECS) instances on which the lifecycle hook takes effect. When you call this operation, you can specify parameters such as ScalingActivityId, LifecycleActionToken, and MaxResults to query the details of a lifecycle hook.</p>
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
     * <p>Queries the details of a lifecycle hook. If you want to query the details of a lifecycle hook, you can call the DescribeLifecycleActions operation. For example, you can query the execution status and ID of a lifecycle hook, along with the Elastic Compute Service (ECS) instances on which the lifecycle hook takes effect. When you call this operation, you can specify parameters such as ScalingActivityId, LifecycleActionToken, and MaxResults to query the details of a lifecycle hook.</p>
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
     * <p>You can use one of the following methods to query lifecycle hooks:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle hooks. If you want to check whether the configurations of your lifecycle hooks are correct or you want to query the details of multiple lifecycle hooks at the same time, you can call the DescribeLifecycleHooks operation. You can specify lifecycle hook IDs or scaling group IDs when you call this operation. This operation returns details such as the default actions, scaling activities, Alibaba Cloud Resource Names (ARNs) of notification recipients, and timeout periods of lifecycle hooks.</p>
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
     * <p>You can use one of the following methods to query lifecycle hooks:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries lifecycle hooks. If you want to check whether the configurations of your lifecycle hooks are correct or you want to query the details of multiple lifecycle hooks at the same time, you can call the DescribeLifecycleHooks operation. You can specify lifecycle hook IDs or scaling group IDs when you call this operation. This operation returns details such as the default actions, scaling activities, Alibaba Cloud Resource Names (ARNs) of notification recipients, and timeout periods of lifecycle hooks.</p>
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
     * <p>Queries resource quotas. You can call the DescribeLimitation operation to query the upper limits on resources such as scheduled tasks that can be created in a scaling group, load balancers that can be attached to a scaling group, instances that can be contained in a scaling group, and scaling configurations that can be created in a scaling group.</p>
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
     * <p>Queries resource quotas. You can call the DescribeLimitation operation to query the upper limits on resources such as scheduled tasks that can be created in a scaling group, load balancers that can be attached to a scaling group, instances that can be contained in a scaling group, and scaling configurations that can be created in a scaling group.</p>
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
     * <p>Queries notifications. If you want to learn about a notification regarding the status of a scaling event or resource changes, you can call the DescribeNotificationConfigurations operation. This operation enables you to retrieve notification details, analyze resource change data, and refine scaling policies to efficiently utilize resources and fulfill business needs.</p>
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
     * <p>Queries notifications. If you want to learn about a notification regarding the status of a scaling event or resource changes, you can call the DescribeNotificationConfigurations operation. This operation enables you to retrieve notification details, analyze resource change data, and refine scaling policies to efficiently utilize resources and fulfill business needs.</p>
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
     * <p>Filters instance types that meet your business requirements. If you create a scaling configuration by opting for the Specify Instance Type approach, you can call the DescribePatternTypes operation. This operation is designed to sift through and identify instance types that fulfill your specific business needs. It does so by examining the number of vCPUs, memory size, instance family level, and maximum budgeted expense that you specify within the scaling configuration settings.</p>
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
     * <p>Filters instance types that meet your business requirements. If you create a scaling configuration by opting for the Specify Instance Type approach, you can call the DescribePatternTypes operation. This operation is designed to sift through and identify instance types that fulfill your specific business needs. It does so by examining the number of vCPUs, memory size, instance family level, and maximum budgeted expense that you specify within the scaling configuration settings.</p>
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
     * <p>You can specify a scaling group ID to query all scaling activities in the scaling group.
     * You can filter query results based on the status of scaling activities.
     * You can query scaling activities that are executed in the previous 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scaling activities.</p>
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
     * <b>description</b> :
     * <p>You can specify a scaling group ID to query all scaling activities in the scaling group.
     * You can filter query results based on the status of scaling activities.
     * You can query scaling activities that are executed in the previous 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scaling activities.</p>
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
     * <p>Queries the details of a scaling activity. The DescribeScalingActivityDetail operation enables you to access and monitor the details of a scaling activity, which is beneficial for troubleshooting and performance analysis purposes.</p>
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
     * <p>Queries the details of a scaling activity. The DescribeScalingActivityDetail operation enables you to access and monitor the details of a scaling activity, which is beneficial for troubleshooting and performance analysis purposes.</p>
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
     * <p>Queries scaling configurations.</p>
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
     * <p>Queries scaling configurations.</p>
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
     * <p>Queries a scaling group. You can call the DescribeScalingGroupDetail operation to query the basic information, instances, and scaling configurations of a scaling group. If you set OutputFormat to yaml, the output is a Kubernetes Deployment file in the YAML format.</p>
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
     * <p>Queries a scaling group. You can call the DescribeScalingGroupDetail operation to query the basic information, instances, and scaling configurations of a scaling group. If you set OutputFormat to yaml, the output is a Kubernetes Deployment file in the YAML format.</p>
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
     * <p>Queries scaling groups. If you want to query the basic information, instances, and scaling configurations of a scaling group, you can call the DescribeScalingGroups operation.</p>
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
     * <p>Queries scaling groups. If you want to query the basic information, instances, and scaling configurations of a scaling group, you can call the DescribeScalingGroups operation.</p>
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
     * <p>Queries the Elastic Compute Service (ECS) instances in a scaling group. If you want to flexibly filter ECS instances that meet the specified criteria and query the instance details, you can call the DescribeScalingInstances operation. This operation enables you to input custom parameters for precise query of ECS instances, helping you gain a clear understanding of the instance details and optimize scaling configurations.</p>
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
     * <p>Queries the Elastic Compute Service (ECS) instances in a scaling group. If you want to flexibly filter ECS instances that meet the specified criteria and query the instance details, you can call the DescribeScalingInstances operation. This operation enables you to input custom parameters for precise query of ECS instances, helping you gain a clear understanding of the instance details and optimize scaling configurations.</p>
     * 
     * @param request DescribeScalingInstancesRequest
     * @return DescribeScalingInstancesResponse
     */
    public DescribeScalingInstancesResponse describeScalingInstances(DescribeScalingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all scaling rules in a scaling group.</p>
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
     * <b>description</b> :
     * <p>You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all scaling rules in a scaling group.</p>
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
     * <p>You can query scheduled tasks by scaling rule, task ID, or task name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scheduled tasks. A scheduled task is a predefined task that triggers the automatic execution of a scaling rule at the specified point in time. It ensures an automatic scaling of computing resources to fulfill your business demands at a minimum cost. After you create a scheduled task, you can call the DescribeScheduledTasks operation to query the details of the task, such as the execution time point and the scaling group ID. You can also call this operation to query the total number of existing scheduled tasks.</p>
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
     * <p>You can query scheduled tasks by scaling rule, task ID, or task name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scheduled tasks. A scheduled task is a predefined task that triggers the automatic execution of a scaling rule at the specified point in time. It ensures an automatic scaling of computing resources to fulfill your business demands at a minimum cost. After you create a scheduled task, you can call the DescribeScheduledTasks operation to query the details of the task, such as the execution time point and the scaling group ID. You can also call this operation to query the total number of existing scheduled tasks.</p>
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
     * <p>Disassociates one or more Application Load Balancer (ALB) server groups from a scaling group.</p>
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
     * <p>Disassociates one or more Application Load Balancer (ALB) server groups from a scaling group.</p>
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
     * <p>Disassociates one or more ApsaraDB RDS instances from a scaling group.</p>
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
     * <p>Disassociates one or more ApsaraDB RDS instances from a scaling group.</p>
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
     * <p>Detach server groups from a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the DetachServerGroups operation. By detaching Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups from your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>Detach server groups from a scaling group. To seamlessly adjust the number of instances in response to changes in your business workload or to maintain the uninterrupted accessibility of your application, you can call the DetachServerGroups operation. By detaching Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups from your scaling group, this operation enables Auto Scaling to automatically tailor your computing capacity to your business needs. Furthermore, it optimizes traffic routing by dynamically allocating incoming requests based on current workload patterns, which significantly improves the stability and performance of your application.</p>
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
     * <p>Queries tags. You can call the ListTagResources operation to query tags that are added to Auto Scaling resources, thereby clarifying resource utilization and facilitating efficient management. This operation aids in the automation of resource categorization and permission management processes.</p>
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
     * <p>Queries tags. You can call the ListTagResources operation to query tags that are added to Auto Scaling resources, thereby clarifying resource utilization and facilitating efficient management. This operation aids in the automation of resource categorization and permission management processes.</p>
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
     * <p>  If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you set the MetricType parameter to custom, the valid values are your custom metrics.</li>
     * <li>For information about the metrics that are supported if you set the MetricType parameter to system, see<a href="https://help.aliyun.com/document_detail/74854.html"> Event-triggered task for system monitoring</a>.<blockquote>
     * <p>The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the <code>DimensionKey</code> and <code>DimensionValue</code> parameters in the &quot;Request parameters&quot; section of this topic.</p>
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
     * <p>  If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you set the MetricType parameter to custom, the valid values are your custom metrics.</li>
     * <li>For information about the metrics that are supported if you set the MetricType parameter to system, see<a href="https://help.aliyun.com/document_detail/74854.html"> Event-triggered task for system monitoring</a>.<blockquote>
     * <p>The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the <code>DimensionKey</code> and <code>DimensionValue</code> parameters in the &quot;Request parameters&quot; section of this topic.</p>
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
     * <p>If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration for a scaling group that contains elastic container instances.</p>
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
     * <b>description</b> :
     * <p>If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration for a scaling group that contains elastic container instances.</p>
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
     * <p>Modifies the attributes of an Elastic Compute Service (ECS) instance in a scaling group. You can call the ModifyInstanceAttribute operation to modify the lifecycle management attribute of a manually added ECS instance in a scaling group.</p>
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
     * <b>summary</b> : 
     * <p>Modifies the attributes of an Elastic Compute Service (ECS) instance in a scaling group. You can call the ModifyInstanceAttribute operation to modify the lifecycle management attribute of a manually added ECS instance in a scaling group.</p>
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
     * <p>You can use one of the following methods to locate the lifecycle hook that you want to modify:</p>
     * <ul>
     * <li>Specify LifecycleHookId. In this case, ScalingGroupId and LifecycleHookName are ignored.</li>
     * <li>Specify ScalingGroupId and LifecycleHookName. Each lifecycle hook within a scaling group has a unique name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle hook. If an existing lifecycle hook does not meet your business requirements anymore, you can call the ModifyLifecycleHook operation to modify the information such as the scaling event, timeout period, and default action of the lifecycle hook. Before you modify a lifecycle hook, you can locate the lifecycle hook by its ID, name, or scaling group.</p>
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
     * <b>description</b> :
     * <p>You can use one of the following methods to locate the lifecycle hook that you want to modify:</p>
     * <ul>
     * <li>Specify LifecycleHookId. In this case, ScalingGroupId and LifecycleHookName are ignored.</li>
     * <li>Specify ScalingGroupId and LifecycleHookName. Each lifecycle hook within a scaling group has a unique name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle hook. If an existing lifecycle hook does not meet your business requirements anymore, you can call the ModifyLifecycleHook operation to modify the information such as the scaling event, timeout period, and default action of the lifecycle hook. Before you modify a lifecycle hook, you can locate the lifecycle hook by its ID, name, or scaling group.</p>
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
     * <p>You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration.</p>
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
     * <b>description</b> :
     * <p>You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling configuration.</p>
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
     * <p>  You cannot modify the following parameters by calling this operation:
     *     *   RegionId
     *     *   LoadBalancerId
     *     **
     *     <strong>Note</strong> If you want to modify the load balancer settings of your scaling group, you can call the AttachLoadBalancers operation or the DetachLoadBalancers operation.
     *     *   DBInstanceId
     *     **
     *     <strong>Note</strong> If you want to modify the ApsaraDB RDS instance settings of your scaling group, you can call the AttachDBInstances operation or the DetachDBInstances operation.</p>
     * <ul>
     * <li>You can call this operation to modify a scaling group only when the scaling group is in the <code>Active</code> or <code>Inactive</code> state.</li>
     * <li>Enabling a new scaling configuration in the scaling group will not impact existing Elastic Compute Service (ECS) instances or elastic container instances that were provisioned based on the previous scaling configuration. These instances will continue to run as expected.</li>
     * <li>If the modification of the MaxSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new maximum limit, Auto Scaling proactively removes the surplus instances to restore the total number to match the new maximum limit.</li>
     * <li>If the modification of the MinSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new minimum threshold, Auto Scaling proactively adds more instances to the scaling group to ensure that the total number aligns with the new minimum threshold.</li>
     * <li>If the modification of the DesiredCapacity setting leads to the total number of ECS instances or elastic container instances in the scaling group not matching the new desired capacity, Auto Scaling proactively adjusts the total number of instances to ensure that the total number aligns with the new desired capacity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can modify scaling groups to adjust your computing power with ease. The computing power refers to the instances that provide the computing capability. When your scaling group cannot meet your business requirements, you can call the ModifyScalingGroup operation to modify scaling group attributes such as the maximum, minimum, and expected numbers of instances. This prevents repeated creation and configuration of scaling groups, which saves you a lot of time and resource costs.</p>
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
     * <b>description</b> :
     * <p>  You cannot modify the following parameters by calling this operation:
     *     *   RegionId
     *     *   LoadBalancerId
     *     **
     *     <strong>Note</strong> If you want to modify the load balancer settings of your scaling group, you can call the AttachLoadBalancers operation or the DetachLoadBalancers operation.
     *     *   DBInstanceId
     *     **
     *     <strong>Note</strong> If you want to modify the ApsaraDB RDS instance settings of your scaling group, you can call the AttachDBInstances operation or the DetachDBInstances operation.</p>
     * <ul>
     * <li>You can call this operation to modify a scaling group only when the scaling group is in the <code>Active</code> or <code>Inactive</code> state.</li>
     * <li>Enabling a new scaling configuration in the scaling group will not impact existing Elastic Compute Service (ECS) instances or elastic container instances that were provisioned based on the previous scaling configuration. These instances will continue to run as expected.</li>
     * <li>If the modification of the MaxSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new maximum limit, Auto Scaling proactively removes the surplus instances to restore the total number to match the new maximum limit.</li>
     * <li>If the modification of the MinSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new minimum threshold, Auto Scaling proactively adds more instances to the scaling group to ensure that the total number aligns with the new minimum threshold.</li>
     * <li>If the modification of the DesiredCapacity setting leads to the total number of ECS instances or elastic container instances in the scaling group not matching the new desired capacity, Auto Scaling proactively adjusts the total number of instances to ensure that the total number aligns with the new desired capacity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling group. If you want to enable policy-based automatic addition or removal of instances of a specific type to meet evolving business requirements, you can modify scaling groups to adjust your computing power with ease. The computing power refers to the instances that provide the computing capability. When your scaling group cannot meet your business requirements, you can call the ModifyScalingGroup operation to modify scaling group attributes such as the maximum, minimum, and expected numbers of instances. This prevents repeated creation and configuration of scaling groups, which saves you a lot of time and resource costs.</p>
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
     * <p>Modifies a scaling rule. If an existing scaling rule cannot meet your business requirements, you can call the ModifyScalingRule operation to modify the scaling rule, without the need to create a new one. This streamlines your workflow, enhancing operational efficiency while also contributing to cost optimization by avoiding redundant steps.</p>
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
     * <b>summary</b> : 
     * <p>Modifies a scaling rule. If an existing scaling rule cannot meet your business requirements, you can call the ModifyScalingRule operation to modify the scaling rule, without the need to create a new one. This streamlines your workflow, enhancing operational efficiency while also contributing to cost optimization by avoiding redundant steps.</p>
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
     * <p>You can use the following parameters to specify the scaling method of a scheduled task:</p>
     * <ul>
     * <li>If you use the <code>ScheduledAction</code> parameter, you must select an existing scaling rule for the scheduled task.</li>
     * <li>If you use the <code>ScalingGroupId</code> parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.<blockquote>
     * <p>You cannot specify the <code>ScheduledAction</code> and <code>ScalingGroupId</code> parameters at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scheduled task. If an existing scheduled task cannot meet your business requirements, you can call the ModifyScheduledTask operation to adjust its parameter settings including the scaling rule to execute and the boundary values of your scaling group, without the need to create a new scheduled task. This operation provides a flexible way to optimize scheduled tasks.</p>
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
     * <b>description</b> :
     * <p>You can use the following parameters to specify the scaling method of a scheduled task:</p>
     * <ul>
     * <li>If you use the <code>ScheduledAction</code> parameter, you must select an existing scaling rule for the scheduled task.</li>
     * <li>If you use the <code>ScalingGroupId</code> parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.<blockquote>
     * <p>You cannot specify the <code>ScheduledAction</code> and <code>ScalingGroupId</code> parameters at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scheduled task. If an existing scheduled task cannot meet your business requirements, you can call the ModifyScheduledTask operation to adjust its parameter settings including the scaling rule to execute and the boundary values of your scaling group, without the need to create a new scheduled task. This operation provides a flexible way to optimize scheduled tasks.</p>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.</p>
     * <ul>
     * <li>This operation is supported by only multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>.</li>
     * <li>A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.</li>
     * <li>During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
     * **
     * <strong>Note</strong> If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebalances the distribution of Elastic Compute Service (ECS) instances across zones. If ECS instances are unevenly distributed across multiple zones, you can call the RebalanceInstances operation to rebalance the distribution of the ECS instances across the zones.</p>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.</p>
     * <ul>
     * <li>This operation is supported by only multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>.</li>
     * <li>A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.</li>
     * <li>During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
     * **
     * <strong>Note</strong> If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rebalances the distribution of Elastic Compute Service (ECS) instances across zones. If ECS instances are unevenly distributed across multiple zones, you can call the RebalanceInstances operation to rebalance the distribution of the ECS instances across the zones.</p>
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
     * <p>You can call this operation only when the desired ECS instance enters a Pending state.\
     * An ECS instance can stay in a Pending state for up to six hours. Each time an ECS instance enters a Pending state, you can extend the time window during which the ECS instance stays in a Pending state up to 20 times.</p>
     * 
     * <b>summary</b> : 
     * <p>Extends the time window during which Elastic Compute Service (ECS) instances stay in a Pending state. If the current time window during which an ECS instance stays in a Pending state is not sufficient for you to complete custom operations on the ECS instance, you can call the RecordLifecycleActionHeartbeat operation to extend the time window. When you call this operation, you can specify lifecycleHookId, lifecycleActionToken, and heartbeatTimeout to extend the time window for the desired ECS instance.</p>
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
     * <p>You can call this operation only when the desired ECS instance enters a Pending state.\
     * An ECS instance can stay in a Pending state for up to six hours. Each time an ECS instance enters a Pending state, you can extend the time window during which the ECS instance stays in a Pending state up to 20 times.</p>
     * 
     * <b>summary</b> : 
     * <p>Extends the time window during which Elastic Compute Service (ECS) instances stay in a Pending state. If the current time window during which an ECS instance stays in a Pending state is not sufficient for you to complete custom operations on the ECS instance, you can call the RecordLifecycleActionHeartbeat operation to extend the time window. When you call this operation, you can specify lifecycleHookId, lifecycleActionToken, and heartbeatTimeout to extend the time window for the desired ECS instance.</p>
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
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activity is in progress within the scaling group.</p>
     * <blockquote>
     * <p>If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.</p>
     * </blockquote>
     * <ul>
     * <li>If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.</li>
     * <li>If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.</li>
     * <li>If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
     * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.</p>
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
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activity is in progress within the scaling group.</p>
     * <blockquote>
     * <p>If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.</p>
     * </blockquote>
     * <ul>
     * <li>If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.</li>
     * <li>If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.</li>
     * <li>If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
     * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more Elastic Compute Service (ECS) instances or elastic container instances from a scaling group.</p>
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
     * <p>Resumes suspended processes in a scaling group.</p>
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
     * <p>Resumes suspended processes in a scaling group.</p>
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
     * <p>  Before you call this operation, take note of the following items:
     *     *   The scaling group is in the Active state.
     *     *   The scaling group has no ongoing scaling activities.</p>
     * <ul>
     * <li>If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities before the cooldown period of the scaling group expires.</li>
     * <li>If the addition of a specific number of Elastic Compute Service (ECS) instances to the scaling group causes the total number of ECS instances in the scaling group to exceed the maximum allowed number, Auto Scaling adds ECS instances to the scaling group until the total number of instances is equal to the maximum allowed number.</li>
     * <li>If the removal of a specific number of ECS instances from the scaling group causes the total number of ECS instances in the scaling group to be less than the minimum allowed number, Auto Scaling removes ECS instances from the scaling group until the total number of instances is equal to the minimum allowed number.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of <code>ScalingActivityId</code> in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales instances. The ScaleWithAdjustment operation differs from the ExecuteScalingRule operation in that ScaleWithAdjust can directly scale instances without requiring you to create a scaling rule in advance.</p>
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
     * <b>description</b> :
     * <p>  Before you call this operation, take note of the following items:
     *     *   The scaling group is in the Active state.
     *     *   The scaling group has no ongoing scaling activities.</p>
     * <ul>
     * <li>If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities before the cooldown period of the scaling group expires.</li>
     * <li>If the addition of a specific number of Elastic Compute Service (ECS) instances to the scaling group causes the total number of ECS instances in the scaling group to exceed the maximum allowed number, Auto Scaling adds ECS instances to the scaling group until the total number of instances is equal to the maximum allowed number.</li>
     * <li>If the removal of a specific number of ECS instances from the scaling group causes the total number of ECS instances in the scaling group to be less than the minimum allowed number, Auto Scaling removes ECS instances from the scaling group until the total number of instances is equal to the minimum allowed number.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of <code>ScalingActivityId</code> in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales instances. The ScaleWithAdjustment operation differs from the ExecuteScalingRule operation in that ScaleWithAdjust can directly scale instances without requiring you to create a scaling rule in advance.</p>
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
     * <p>Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see <a href="~~EnterStandby~~">EnterStandby</a> and <a href="~~SetInstancesProtection~~">SetInstancesProtection</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets instance health. At times, the automatic health check system might not sufficiently determine the precise health status of your Elastic Compute Service (ECS) instances or elastic container instances. To overcome this, you can call the SetInstanceHealth operation to swiftly pinpoint problematic instances and resolve issues. This operation is designed to more precisely align with real-world business requirements and tackle O\&amp;M hurdles efficiently.</p>
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
     * <p>Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see <a href="~~EnterStandby~~">EnterStandby</a> and <a href="~~SetInstancesProtection~~">SetInstancesProtection</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets instance health. At times, the automatic health check system might not sufficiently determine the precise health status of your Elastic Compute Service (ECS) instances or elastic container instances. To overcome this, you can call the SetInstanceHealth operation to swiftly pinpoint problematic instances and resolve issues. This operation is designed to more precisely align with real-world business requirements and tackle O\&amp;M hurdles efficiently.</p>
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
     * <p>Once ECS instances enter the Protected state, they become subject to the following restrictions:</p>
     * <ul>
     * <li>ECS instances will persist in the Protected state, unless you deliberately remove them from this state.</li>
     * <li>Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">Remove an ECS instance</a>.</li>
     * <li>ECS instances in the Protected state maintain their existing health status even when they undergo stopping or restarting processes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Puts Elastic Compute Service (ECS) instances into the Protected state. When ECS instances are put into the Protected state, they become immune to manual deletion attempts by using the Auto Scaling console or API operations. This operation serves as a robust safeguard, efficiently preventing any inadvertent instance release that could lead to irreversible consequences.</p>
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
     * <p>Once ECS instances enter the Protected state, they become subject to the following restrictions:</p>
     * <ul>
     * <li>ECS instances will persist in the Protected state, unless you deliberately remove them from this state.</li>
     * <li>Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">Remove an ECS instance</a>.</li>
     * <li>ECS instances in the Protected state maintain their existing health status even when they undergo stopping or restarting processes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Puts Elastic Compute Service (ECS) instances into the Protected state. When ECS instances are put into the Protected state, they become immune to manual deletion attempts by using the Auto Scaling console or API operations. This operation serves as a robust safeguard, efficiently preventing any inadvertent instance release that could lead to irreversible consequences.</p>
     * 
     * @param request SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtection(SetInstancesProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstancesProtectionWithOptions(request, runtime);
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
     * <p>Creates and attaches tags. You can call the TagResources operation to uniformly create and attach tags to your Auto Scaling resources, streamlining resource management. This capability empowers you to categorize resources based on tags, thereby enhancing the overall efficiency of resource allocation and utilization.</p>
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
     * <p>Creates and attaches tags. You can call the TagResources operation to uniformly create and attach tags to your Auto Scaling resources, streamlining resource management. This capability empowers you to categorize resources based on tags, thereby enhancing the overall efficiency of resource allocation and utilization.</p>
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
     * <p>Checks whether Auto Scaling is authorized to access Elastic Compute Service (ECS) and Elastic Container Instance resources.</p>
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
     * <p>Checks whether Auto Scaling is authorized to access Elastic Compute Service (ECS) and Elastic Container Instance resources.</p>
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
