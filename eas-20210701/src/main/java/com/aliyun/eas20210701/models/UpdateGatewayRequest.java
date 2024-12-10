// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Internet access. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
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

    @NameInMap("EnableSSLRedirection")
    public Boolean enableSSLRedirection;

    /**
     * <p>The instance type used for the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.4xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Indicates whether it is the default private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    /**
     * <p>The private gateway alias.</p>
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

    public static UpdateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRequest self = new UpdateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRequest setEnableInternet(Boolean enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }
    public Boolean getEnableInternet() {
        return this.enableInternet;
    }

    public UpdateGatewayRequest setEnableIntranet(Boolean enableIntranet) {
        this.enableIntranet = enableIntranet;
        return this;
    }
    public Boolean getEnableIntranet() {
        return this.enableIntranet;
    }

    public UpdateGatewayRequest setEnableSSLRedirection(Boolean enableSSLRedirection) {
        this.enableSSLRedirection = enableSSLRedirection;
        return this;
    }
    public Boolean getEnableSSLRedirection() {
        return this.enableSSLRedirection;
    }

    public UpdateGatewayRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateGatewayRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

}
