// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UnassociateAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The ID of the cloud resource from which you want to disassociate the Anycast EIP.</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The region where the cloud resource is deployed.</p>
     */
    @NameInMap("BindInstanceRegionId")
    public String bindInstanceRegionId;

    /**
     * <p>The type of cloud resource from which you want to disassociate the Anycast EIP. Valid values:</p>
     * <br>
     * <p>*   **SlbInstance**: an internal-facing Server Load Balancer (SLB) instance that is deployed in a virtual private cloud (VPC)</p>
     * <p>*   **NetworkInterface**: an elastic network interface (ENI)</p>
     */
    @NameInMap("BindInstanceType")
    public String bindInstanceType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without disassociating the Anycast EIP. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The secondary private IP address of the ENI from which you want to disassociate the Anycast EIP.</p>
     * <br>
     * <p>This parameter is valid only when you set **BindInstanceType** to **NetworkInterface**. If you do not set this parameter, the primary private IP address of the ENI is returned.</p>
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
