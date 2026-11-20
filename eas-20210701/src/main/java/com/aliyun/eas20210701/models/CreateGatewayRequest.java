// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    /**
     * <p>The name of the resource group. For more information, see the ResourceName field returned by the <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a> operation when ResourceType is set to SelfManaged.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-4gt8twzwllfo******</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>false: Disables auto-renewal. This is the default value.</li>
     * <li>true: Enables auto-renewal.</li>
     * </ul>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: Subscription.</li>
     * <li>PostPaid: Pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to enable public network access. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableInternet")
    public Boolean enableInternet;

    /**
     * <p>Specifies whether to enable internal network access. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntranet")
    public Boolean enableIntranet;

    /**
     * <p>The type of the private gateway. A value of ALB indicates an application-type dedicated gateway. A value of FullyManaged indicates a fully managed dedicated gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The instance type used by the private gateway. Valid values:</p>
     * <ul>
     * <li>2c4g</li>
     * <li>4c8g</li>
     * <li>8c16g</li>
     * <li>16c32g</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2c4g</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The alias of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>mygateway1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of nodes in the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateGatewayRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateGatewayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateGatewayRequest setEnableInternet(Boolean enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }
    public Boolean getEnableInternet() {
        return this.enableInternet;
    }

    public CreateGatewayRequest setEnableIntranet(Boolean enableIntranet) {
        this.enableIntranet = enableIntranet;
        return this;
    }
    public Boolean getEnableIntranet() {
        return this.enableIntranet;
    }

    public CreateGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateGatewayRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateGatewayRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
