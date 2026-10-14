// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsResponseBody extends TeaModel {
    /**
     * <p>The IDs, editions, remarks, and IP types of the Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<DescribeInstanceIdsResponseBodyInstanceIds> instanceIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>310A41FD-0990-5610-92E0-A6A55D7C6444</p>
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
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Insurance Edition.</li>
         * <li><strong>1</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Unlimited Edition.</li>
         * <li><strong>2</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Acceleration Line.</li>
         * <li><strong>3</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Secure Acceleration Line.</li>
         * <li><strong>9</strong>: Anti-DDoS Pro or Anti-DDoS Premium (the Chinese mainland) Professional Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Edition")
        public Integer edition;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zvp2eibz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP forwarding mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>fnat</strong>: The IP versions of the origin server and the client are the same. IPv4 client requests are forwarded to the IPv4 origin server, and IPv6 client requests are forwarded to the IPv6 origin server.</li>
         * <li><strong>v6tov4</strong>: Both IPv6 and IPv4 client requests are forwarded to the IPv4 origin server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fnat</p>
         */
        @NameInMap("IpMode")
        public String ipMode;

        /**
         * <p>The IP protocol version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4.</li>
         * <li><strong>Ipv6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ipv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The remark of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
