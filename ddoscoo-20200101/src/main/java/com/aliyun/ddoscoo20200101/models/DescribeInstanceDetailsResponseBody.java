// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsResponseBody extends TeaModel {
    /**
     * <p>The IP address and ISP line information about the instance.</p>
     */
    @NameInMap("InstanceDetails")
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3C814429-21A5-4673-827E-FDD19DC75681</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsResponseBody self = new DescribeInstanceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsResponseBody setInstanceDetails(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    public DescribeInstanceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos extends TeaModel {
        @NameInMap("CertConfigured")
        public Boolean certConfigured;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.117.XX.XX</p>
         */
        @NameInMap("Eip")
        public String eip;

        @NameInMap("FunctionVersion")
        public String functionVersion;

        /**
         * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>fnat</strong>: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</li>
         * <li><strong>v6tov4</strong>: All requests are forwarded to origin servers that use IPv4 addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fnat</p>
         */
        @NameInMap("IpMode")
        public String ipMode;

        /**
         * <p>The IP version of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4</li>
         * <li><strong>Ipv6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ipv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: indicates that the instance is normal.</li>
         * <li><strong>expired</strong>: indicates that the instance expired.</li>
         * <li><strong>defense</strong>: indicates that traffic scrubbing is performed on the asset that is protected by the instance.</li>
         * <li><strong>blackhole</strong>: indicates that blackhole filtering is triggered for the asset that is protected by the instance.</li>
         * <li><strong>punished</strong>: indicates that the instance is in penalty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TlsVersion")
        public String tlsVersion;

        public static DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos self = new DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setCertConfigured(Boolean certConfigured) {
            this.certConfigured = certConfigured;
            return this;
        }
        public Boolean getCertConfigured() {
            return this.certConfigured;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setSsl13Enabled(Boolean ssl13Enabled) {
            this.ssl13Enabled = ssl13Enabled;
            return this;
        }
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setTlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }
        public String getTlsVersion() {
            return this.tlsVersion;
        }

    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetails extends TeaModel {
        /**
         * <p>The information about the IP address of the instance.</p>
         */
        @NameInMap("EipInfos")
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> eipInfos;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zvp2eibz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The protection line of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>coop-line-001</p>
         */
        @NameInMap("Line")
        public String line;

        public static DescribeInstanceDetailsResponseBodyInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetails self = new DescribeInstanceDetailsResponseBodyInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setEipInfos(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> eipInfos) {
            this.eipInfos = eipInfos;
            return this;
        }
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos> getEipInfos() {
            return this.eipInfos;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

    }

}
