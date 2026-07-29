// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachToPolicyRequest extends TeaModel {
    /**
     * <p>The list of protection objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpPortProtocolList")
    public java.util.List<AttachToPolicyRequestIpPortProtocolList> ipPortProtocolList;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd8b4d70-e4e0-413a-b390-e71d********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * <ul>
     * <li><strong>Not specified</strong>: Associates the default surf anti-DDoS engine policy.</li>
     * <li><strong>2</strong>: Associates the new stream anti-DDoS engine policy.<blockquote>
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

    public static AttachToPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachToPolicyRequest self = new AttachToPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AttachToPolicyRequest setIpPortProtocolList(java.util.List<AttachToPolicyRequestIpPortProtocolList> ipPortProtocolList) {
        this.ipPortProtocolList = ipPortProtocolList;
        return this;
    }
    public java.util.List<AttachToPolicyRequestIpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    public AttachToPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public AttachToPolicyRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

    public static class AttachToPolicyRequestIpPortProtocolList extends TeaModel {
        /**
         * <p>The IP address of the protection object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>112.124.241.***</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the protection object.</p>
         * <blockquote>
         * <p>Only port-specific mitigation policies support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8*</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The port range of the protection object.</p>
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
         * <p>The protocol type of the protection object. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol.</li>
         * <li><strong>udp</strong>: User Datagram Protocol.<blockquote>
         * <p>Only port-specific mitigation policies support this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static AttachToPolicyRequestIpPortProtocolList build(java.util.Map<String, ?> map) throws Exception {
            AttachToPolicyRequestIpPortProtocolList self = new AttachToPolicyRequestIpPortProtocolList();
            return TeaModel.build(map, self);
        }

        public AttachToPolicyRequestIpPortProtocolList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AttachToPolicyRequestIpPortProtocolList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachToPolicyRequestIpPortProtocolList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AttachToPolicyRequestIpPortProtocolList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
