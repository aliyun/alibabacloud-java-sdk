// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardEntryAttributeResponseBody extends TeaModel {
    /**
     * <p>The creation time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-26T15:38:27Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The Elastic IP Address (EIP) that provides public network access in the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>36.XXX.XXX.72</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The external port or port range for port forwarding.</p>
     * <ul>
     * <li><p>The port range must be between 1 and 65535.</p>
     * </li>
     * <li><p>To forward a port range, separate the start and end ports with a forward slash (/), such as 10/20.</p>
     * </li>
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
     * <p>The probe port for DNAT. It must fall within the internal port range. The default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public String healthCheckPort;

    /**
     * <p>The private IP address of the instance that communicates over the public network through the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XXX.XXX.50</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The internal port or port range for port forwarding.</p>
     * <ul>
     * <li><p>The port range must be between 1 and 65535.</p>
     * </li>
     * <li><p>To forward a port range, separate the start and end ports with a forward slash (/), such as 10/20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><p><strong>TCP</strong>: Forwards TCP messages.</p>
     * </li>
     * <li><p><strong>UDP</strong>: Forwards UDP messages.</p>
     * </li>
     * <li><p><strong>Any</strong>: Forwards messages of all protocols.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Any</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT Gateway.</p>
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
     * <p>The standby Elastic IP Address (EIP) that provides public network access. You must select a standby EIP attached to the NAT Gateway. The standby public IP becomes active after the DNAT entry is created.</p>
     * 
     * <strong>example:</strong>
     * <p>101.XXX.XXX.4</p>
     */
    @NameInMap("StandbyExternalIp")
    public String standbyExternalIp;

    /**
     * <p>The status of the standby EIP.</p>
     * <ul>
     * <li><p>Running: Enabled.</p>
     * </li>
     * <li><p>Stopping: Being disabled.</p>
     * </li>
     * <li><p>Stopped: Disabled.</p>
     * </li>
     * <li><p>Starting: Being enabled.</p>
     * </li>
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
     * <li><p>Pending: The configuration is in progress, such as during creation or modification.</p>
     * </li>
     * <li><p>Available: The entry is active.</p>
     * </li>
     * <li><p>Deleting: The entry is being deleted.</p>
     * </li>
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
