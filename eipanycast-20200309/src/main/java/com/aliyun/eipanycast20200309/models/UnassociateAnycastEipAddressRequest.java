// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UnassociateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeip-2zeerraiwb7ujsxdc****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The ID of the endpoint from which you want to disassociate the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zebb08phyczzawe****</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The region where the endpoint is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>us-west-1</p>
     */
    @NameInMap("BindInstanceRegionId")
    public String bindInstanceRegionId;

    /**
     * <p>The type of endpoint from which you want to disassociate the Anycast EIP. Valid values:</p>
     * <ul>
     * <li><strong>SlbInstance</strong>: an internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)</li>
     * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SlbInstance</p>
     */
    @NameInMap("BindInstanceType")
    public String bindInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The secondary private IP address of the ENI from which you want to disassociate the Anycast EIP.</p>
     * <p>This parameter is valid only when you set <strong>BindInstanceType</strong> to <strong>NetworkInterface</strong>. If you do not specify this parameter, the primary private IP address of the ENI is used.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    public static UnassociateAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociateAnycastEipAddressRequest self = new UnassociateAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnassociateAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public UnassociateAnycastEipAddressRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public UnassociateAnycastEipAddressRequest setBindInstanceRegionId(String bindInstanceRegionId) {
        this.bindInstanceRegionId = bindInstanceRegionId;
        return this;
    }
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    public UnassociateAnycastEipAddressRequest setBindInstanceType(String bindInstanceType) {
        this.bindInstanceType = bindInstanceType;
        return this;
    }
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    public UnassociateAnycastEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnassociateAnycastEipAddressRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UnassociateAnycastEipAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

}
