// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    /**
     * <p>The resource group ID. To obtain a resource group ID, see the ResourceId field in the response of the <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-4gt8twzwllfo******</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to enable Internet access. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableInternet")
    public Boolean enableInternet;

    /**
     * <p>Specifies whether to enable private access. Default value: true.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntranet")
    public Boolean enableIntranet;

    /**
     * <p>The instance type used by the private gateway. Valid values:</p>
     * <ul>
     * <li>2c4g</li>
     * <li>4c8g</li>
     * <li>8c16g</li>
     * <li>16c32g</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.4xlarge</p>
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

}
