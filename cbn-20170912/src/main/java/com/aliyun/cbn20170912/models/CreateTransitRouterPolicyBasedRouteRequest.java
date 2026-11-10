// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyBasedRouteRequest extends TeaModel {
    /**
     * <p>The address family. Valid values:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressFamily")
    public String addressFamily;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the policy-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter matches traffic whose port numbers fall within the destination port range. If you do not specify this parameter, traffic to any destination port is matched.</p>
     * <p>The port range is specified in the following formats:</p>
     * <ul>
     * <li>80: port 80.</li>
     * <li>80/80: port 80.</li>
     * <li>1/200: ports 1 to 200.</li>
     * <li>-1/-1: all ports.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    /**
     * <p>The destination CIDR block of the route entry. Both IPv4 and IPv6 addresses are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>172.19.2.0/24</p>
     */
    @NameInMap("DestinationCidr")
    public String destinationCidr;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the routing rule entry in the policy route table. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. After the request passes the precheck, the routing rule entry is created in the policy route table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet to be matched. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
     * <p>The DSCP range is specified in the following formats:</p>
     * <ul>
     * <li>1: traffic with a DSCP value of 1.</li>
     * <li>1/10: traffic with a DSCP value from 1 to 10.</li>
     * <li>-1/-1: traffic with any DSCP value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Dscp")
    public String dscp;

    /**
     * <p>The name of the policy-based route.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the policy routing table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptbl-abc123xyz</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    /**
     * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>The priority of each policy-based route in a policy route table of a transit router must be unique. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The protocol type of the traffic packet.</p>
     * <p>Traffic classification rules support matching traffic of various protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ICMP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The source CIDR block. The source CIDR block must be in CIDR format. Example: 192.168.1.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter matches traffic whose port numbers fall within the source port range. If you do not specify this parameter, traffic from any source port is matched.</p>
     * <p>The port range is specified in the following formats:</p>
     * <ul>
     * <li>80: port 80.</li>
     * <li>80/80: port 80.</li>
     * <li>1/200: ports 1 to 200.</li>
     * <li>-1/-1: all ports.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The destination route table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-123abcxyz</p>
     */
    @NameInMap("TargetRouteTableId")
    public String targetRouteTableId;

    public static CreateTransitRouterPolicyBasedRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyBasedRouteRequest self = new CreateTransitRouterPolicyBasedRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyBasedRouteRequest setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setDestinationCidr(String destinationCidr) {
        this.destinationCidr = destinationCidr;
        return this;
    }
    public String getDestinationCidr() {
        return this.destinationCidr;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setDscp(String dscp) {
        this.dscp = dscp;
        return this;
    }
    public String getDscp() {
        return this.dscp;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public CreateTransitRouterPolicyBasedRouteRequest setTargetRouteTableId(String targetRouteTableId) {
        this.targetRouteTableId = targetRouteTableId;
        return this;
    }
    public String getTargetRouteTableId() {
        return this.targetRouteTableId;
    }

}
