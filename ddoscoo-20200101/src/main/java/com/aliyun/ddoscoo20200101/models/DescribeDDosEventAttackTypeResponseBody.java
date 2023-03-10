// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeResponseBody extends TeaModel {
    /**
     * <p>The information about the attack types.</p>
     */
    @NameInMap("AttackTypes")
    public java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> attackTypes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDosEventAttackTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAttackTypeResponseBody self = new DescribeDDosEventAttackTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAttackTypeResponseBody setAttackTypes(java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> attackTypes) {
        this.attackTypes = attackTypes;
        return this;
    }
    public java.util.List<DescribeDDosEventAttackTypeResponseBodyAttackTypes> getAttackTypes() {
        return this.attackTypes;
    }

    public DescribeDDosEventAttackTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDosEventAttackTypeResponseBodyAttackTypes extends TeaModel {
        /**
         * <p>The type of the attack Valid values:</p>
         * <br>
         * <p>*   **QOTD-Reflect-Flood**: QOTD reflection attacks</p>
         * <p>*   **CharGEN-Reflect-Flood**: CHARGEN reflection attacks</p>
         * <p>*   **DNS-Reflect-Flood**: DNS reflection attacks</p>
         * <p>*   **TFTP-Reflect-Flood**: TFTP reflection attacks</p>
         * <p>*   **Portmap-Reflect-Flood**: Portmap reflection attacks</p>
         * <p>*   **NTP-Reflect-Flood**: NTP reflection attacks</p>
         * <p>*   **NetBIOS-Reflect-Flood**: NetBIOS reflection attacks</p>
         * <p>*   **SNMPv2-Reflect-Flood**: SNMPv2 reflection attacks</p>
         * <p>*   **CLDAP-Reflect-Flood**: CLDAP reflection attacks</p>
         * <p>*   **Ripv1-Reflect-Flood**: RIPv1 reflection attacks</p>
         * <p>*   **OpenVPN-Reflect-Flood**: OpenVPN reflection attacks</p>
         * <p>*   **SSDP-Reflect-Flood**: SSDP reflection attacks</p>
         * <p>*   **NetAssistant-Reflect-Flood**: NetAssistant reflection attacks</p>
         * <p>*   **WSDiscovery-Reflect-Flood**: WS-Discovery reflection attacks</p>
         * <p>*   **Kad-Reflect-Flood**: Kad reflection attacks</p>
         * <p>*   **mDNS-Reflect-Flood**: mDNS reflection attacks</p>
         * <p>*   **10001-Reflect-Flood**: reflection attacks over port 10001</p>
         * <p>*   **Memcached-Reflect-Flood**: Memcached reflection attacks</p>
         * <p>*   **QNP-Reflect-Flood**: QNP reflection attacks</p>
         * <p>*   **DVR-Reflect-Flood**: DVR reflection attacks</p>
         * <p>*   **CoAP-Reflect-Flood**: CoAP reflection attacks</p>
         * <p>*   **ADDP-Reflect-Flood**: ADDP reflection attacks</p>
         * <p>*   **Tcp-Syn**: TCP SYN flood attacks</p>
         * <p>*   **Tcp-Fin**: TCP FIN flood attacks</p>
         * <p>*   **Tcp-Ack**: TCP ACK flood attacks</p>
         * <p>*   **Tcp-Rst**: TCP RST flood attacks</p>
         * <p>*   **Tcp-Pushack**: TCP PSH-ACK flood attacks</p>
         * <p>*   **Tcp-Synack**: TCP SYN-ACK flood attacks</p>
         * <p>*   **Udp-None**: UDP attacks</p>
         * <p>*   **Udp-Ssh**: UDP-based SSH attacks</p>
         * <p>*   **Udp-Dns**: UDP-based DNS attacks</p>
         * <p>*   **Udp-Http**: UDP-based HTTP attacks</p>
         * <p>*   **Udp-Https**: UDP-based HTTPS attacks</p>
         * <p>*   **Udp-Ntp**: UDP-based NTP attacks</p>
         * <p>*   **Udp-Ldap**: UDP-based LDAP attacks</p>
         * <p>*   **Udp-Ssdp**: UDP-based SSDP attacks</p>
         * <p>*   **Udp-Memcached**: Memcached UDP reflection attacks</p>
         * <p>*   **Tcp-Other**: other TCP attacks</p>
         * <p>*   **Icmp**: ICMP flood attacks</p>
         * <p>*   **Igmp**: IGMP flood attacks</p>
         * <p>*   **Ipv6**: IPv6 attacks</p>
         */
        @NameInMap("AttackType")
        public String attackType;

        /**
         * <p>The number of request packets of the attack type.</p>
         */
        @NameInMap("InPkts")
        public Long inPkts;

        public static DescribeDDosEventAttackTypeResponseBodyAttackTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosEventAttackTypeResponseBodyAttackTypes self = new DescribeDDosEventAttackTypeResponseBodyAttackTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDDosEventAttackTypeResponseBodyAttackTypes setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeDDosEventAttackTypeResponseBodyAttackTypes setInPkts(Long inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public Long getInPkts() {
            return this.inPkts;
        }

    }

}
