// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseSourceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The MSE engine type. Valid values:</p>
     * <ul>
     * <li>NACOS</li>
     * <li>ZOOKEEPER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NACOS</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1t50e045b5g7i3p****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetMseSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMseSourceRequest self = new GetMseSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetMseSourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetMseSourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetMseSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetMseSourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
