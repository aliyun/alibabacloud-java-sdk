// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>The elastic IP address (EIP) that is used to access the Internet.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The external port or port range that is used for port forwarding.</p>
     * <br>
     * <p>*   Valid values: 1 to 65535.</p>
     * <p>*   To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</p>
     * <p>*   If you set ExternalPort to a port range, you must also set InternalPort to a port range, and the number of ports specified must be the same for both parameters. For example, if you set ExternalPort to 10/20, you can set InternalPort to 80/90.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The name of the DNAT entry. The name must be 2 to 128 characters in length. The name cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The probe port. The port must be within the internal port range. By default, this parameter is left empty.</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The internal port or port range that is used for port forwarding.</p>
     * <br>
     * <p>*   Valid values: 1 to 65535.</p>
     * <p>*   To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol. Valid values:</p>
     * <br>
     * <p>*   **TCP**: forwards TCP packets.</p>
     * <p>*   **UDP**: forwards UDP packets.</p>
     * <p>*   **Any** (default): forwards all packets.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the Network Address Translation (NAT) gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The secondary EIP that is used to access the Internet. You need to select a secondary EIP that is bound to NAT. After the DNAT entry is created, the secondary EIP takes effect.</p>
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
