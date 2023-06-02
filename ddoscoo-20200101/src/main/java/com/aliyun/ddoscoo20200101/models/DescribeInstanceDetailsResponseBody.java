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
        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</p>
         * <p>*   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.</p>
         */
        @NameInMap("IpMode")
        public String ipMode;

        /**
         * <p>The IP version of the protocol. Valid values:</p>
         * <br>
         * <p>*   **Ipv4**: IPv4</p>
         * <p>*   **Ipv6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   **normal**: indicates that the instance is normal.</p>
         * <p>*   **expired**: indicates that the instance expired.</p>
         * <p>*   **defense**: indicates that traffic scrubbing is performed on the asset that is protected by the instance.</p>
         * <p>*   **blackhole**: indicates that blackhole filtering is triggered for the asset that is protected by the instance.</p>
         * <p>*   **punished**: indicates that the instance is in penalty.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos self = new DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
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

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The protection line of the instance.</p>
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
