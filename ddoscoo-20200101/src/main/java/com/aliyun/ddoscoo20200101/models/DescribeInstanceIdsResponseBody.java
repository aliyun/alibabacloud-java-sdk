// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the ID, version, description, and IP address type of the instance.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> instanceIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIdsResponseBody self = new DescribeInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIdsResponseBody setInstanceIds(java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceIdsResponseBodyInstanceIds extends TeaModel {
        /**
         * <p>The mitigation plan of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan</p>
         * <p>*   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan</p>
         * <p>*   **2**: Anti-DDoS Premium instance of the CMA mitigation plan</p>
         * <p>*   **3**: Anti-DDoS Premium instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan</p>
         * <p>*   **9**: Anti-DDoS Pro instance of the Profession mitigation plan</p>
         */
        @NameInMap("Edition")
        public Integer edition;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</p>
         * <p>*   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.</p>
         */
        @NameInMap("IpMode")
        public String ipMode;

        /**
         * <p>The IP version of the protocol of the instance. Valid values:</p>
         * <br>
         * <p>*   **Ipv4**</p>
         * <p>*   **Ipv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static DescribeInstanceIdsResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIdsResponseBodyInstanceIds self = new DescribeInstanceIdsResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setEdition(Integer edition) {
            this.edition = edition;
            return this;
        }
        public Integer getEdition() {
            return this.edition;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceIdsResponseBodyInstanceIds setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
