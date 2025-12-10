// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardEntryAttributeResponseBody extends TeaModel {
    /**
     * <p>The creation time. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-26T15:38:27Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>36.XXX.XXX.72</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The external port or port range that is used for port forwarding.</p>
     * <ul>
     * <li>Valid values: 1 to 65535.</li>
     * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The ID of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-5tfi6f0rutmd00xrhkag7****</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The name of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The DNAT probe port. The port must be within the internal port range. By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public String healthCheckPort;

    /**
     * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XXX.XXX.50</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The internal port or port range that is used for port forwarding.</p>
     * <ul>
     * <li>Valid values: 1 to 65535.</li>
     * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>: forwards TCP packets.</li>
     * <li><strong>UDP</strong>: forwards UDP packets.</li>
     * <li><strong>Any</strong>: forwards all packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Any</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The secondary EIP that is used to access the Internet. You need to select a secondary EIP that is bound to NAT. After the DNAT entry is created, the secondary EIP takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>101.XXX.XXX.4</p>
     */
    @NameInMap("StandbyExternalIp")
    public String standbyExternalIp;

    /**
     * <p>The status of the secondary EIP.</p>
     * <ul>
     * <li>Running</li>
     * <li>Stopping</li>
     * <li>Stopped</li>
     * <li>Starting</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("StandbyStatus")
    public String standbyStatus;

    /**
     * <p>The status of the DNAT entry.</p>
     * <ul>
     * <li>Pending: The DNAT entry is being created or modified.</li>
     * <li>Available: The DNAT entry is available.</li>
     * <li>Deleting: The DNAT entry is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeForwardEntryAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardEntryAttributeResponseBody self = new DescribeForwardEntryAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardEntryAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeForwardEntryAttributeResponseBody setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public DescribeForwardEntryAttributeResponseBody setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public DescribeForwardEntryAttributeResponseBody setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DescribeForwardEntryAttributeResponseBody setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public DescribeForwardEntryAttributeResponseBody setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public DescribeForwardEntryAttributeResponseBody setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeForwardEntryAttributeResponseBody setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public DescribeForwardEntryAttributeResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribeForwardEntryAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeForwardEntryAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardEntryAttributeResponseBody setStandbyExternalIp(String standbyExternalIp) {
        this.standbyExternalIp = standbyExternalIp;
        return this;
    }
    public String getStandbyExternalIp() {
        return this.standbyExternalIp;
    }

    public DescribeForwardEntryAttributeResponseBody setStandbyStatus(String standbyStatus) {
        this.standbyStatus = standbyStatus;
        return this;
    }
    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    public DescribeForwardEntryAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
