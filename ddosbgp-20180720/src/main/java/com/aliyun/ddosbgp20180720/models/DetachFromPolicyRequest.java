// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyRequest extends TeaModel {
    /**
     * <p>The list of protected objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<DetachFromPolicyRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: default mitigation policy.</li>
     * <li><strong>l3</strong>: IP-specific mitigation policy.</li>
     * <li><strong>l4</strong>: port-specific mitigation policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * <ul>
     * <li><strong>Not specified</strong>: dissociates the default surf anti-DDoS engine policy.</li>
     * <li><strong>2</strong>: dissociates the new stream anti-DDoS engine policy.<blockquote>
     * <p>Only port-specific mitigation policies support this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

    public static DetachFromPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachFromPolicyRequest self = new DetachFromPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DetachFromPolicyRequest setIpPortProtocolList(java.util.List<DetachFromPolicyRequestIpPortProtocolList> ipPortProtocolList) {
        this.ipPortProtocolList = ipPortProtocolList;
        return this;
    }
    public java.util.List<DetachFromPolicyRequestIpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    public DetachFromPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DetachFromPolicyRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

    public static class DetachFromPolicyRequestIpPortProtocolList extends TeaModel {
        /**
         * <p>The IP address of the protected object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.118.172.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>8*</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The port range of the protected object.</p>
         * <blockquote>
         * <p>Only port-specific mitigation policies support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8*-9*</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The protocol type of the protected object. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol.</li>
         * <li><strong>udp</strong>: User Datagram Protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DetachFromPolicyRequestIpPortProtocolList build(java.util.Map<String, ?> map) throws Exception {
            DetachFromPolicyRequestIpPortProtocolList self = new DetachFromPolicyRequestIpPortProtocolList();
            return TeaModel.build(map, self);
        }

        public DetachFromPolicyRequestIpPortProtocolList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DetachFromPolicyRequestIpPortProtocolList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DetachFromPolicyRequestIpPortProtocolList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DetachFromPolicyRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
