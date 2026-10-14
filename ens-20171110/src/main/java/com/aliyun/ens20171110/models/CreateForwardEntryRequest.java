// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>The Elastic IP Address (EIP) that provides public network access.</p>
     * <p>The EIP must not be occupied by an SNAT rule of the same NAT gateway. You can check the IpLists.UsingStatus field returned by DescribeNatGateways to confirm that the EIP is in the Idle state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121.XXX.XXX.28</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The external port or port range for port forwarding.</p>
     * <ul>
     * <li>The port range must be within 1 to 65535.</li>
     * <li>To forward traffic within a port range, separate the start and end ports with a forward slash (/), such as 10/20.</li>
     * <li>If ExternalPort is set to a port range, InternalPort must also be set to a port range with the same number of ports. For example, if ExternalPort is set to 10/20, InternalPort must be set to 80/90.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The name of the DNAT rule. The name must be 2 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The health check port for DNAT. The port must be within the internal port range. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The private IP address of the instance that communicates with the Internet through the DNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XXX.XXX</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The internal port or port range for port forwarding.</p>
     * <ul>
     * <li>The port range must be within 1 to 65535.</li>
     * <li>To forward traffic within a port range, separate the start and end ports with a forward slash (/), such as 10/20.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol type. Valid values: </p>
     * <ul>
     * <li><p><strong>TCP</strong>: forwards TCP packets.   </p>
     * </li>
     * <li><p><strong>UDP</strong>: forwards UDP packets.   </p>
     * </li>
     * <li><p><strong>Any</strong> (default): forwards all packets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Any</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The standby EIP that provides public network access. The standby EIP must be bound to the NAT gateway. After the DNAT entry is created, the standby EIP takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>101.XXX.XXX.4</p>
     */
    @NameInMap("StandbyExternalIp")
    public String standbyExternalIp;

    public static CreateForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryRequest self = new CreateForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public CreateForwardEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public CreateForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public CreateForwardEntryRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public CreateForwardEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public CreateForwardEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public CreateForwardEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateForwardEntryRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateForwardEntryRequest setStandbyExternalIp(String standbyExternalIp) {
        this.standbyExternalIp = standbyExternalIp;
        return this;
    }
    public String getStandbyExternalIp() {
        return this.standbyExternalIp;
    }

}
