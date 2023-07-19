// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the instances.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The time when the instance is created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The overdue status of the instance. The value is fixed as **0**, which indicates that your Alibaba Cloud account does not have overdue payments. The instance supports only the subscription billing method.</p>
         */
        @NameInMap("DebtStatus")
        public Integer debtStatus;

        /**
         * <p>The mitigation plan of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan</p>
         * <p>*   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan</p>
         * <p>*   **2**: Anti-DDoS Premium instance of the MCA mitigation plan</p>
         * <p>*   **9**: Anti-DDoS Pro instance of the Profession mitigation plan</p>
         */
        @NameInMap("Edition")
        public Integer edition;

        /**
         * <p>The forwarding status of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance no longer forwards service traffic.</p>
         * <p>*   **1**: The instance forwards service traffic as expected.</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The time when the instance expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</p>
         * <p>*   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.</p>
         */
        @NameInMap("IpMode")
        public String ipMode;

        /**
         * <p>The IP version of the instance. Valid values:</p>
         * <br>
         * <p>*   **Ipv4**: IPv4</p>
         * <p>*   **Ipv6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether the 95th percentile metering method has been enabled for the instance. Valid values:</p>
         * <br>
         * <p>*   0: The 95th percentile metering method has not been enabled for the instance.</p>
         * <p>*   1: The 95th percentile metering method has been enabled for the instance.</p>
         */
        @NameInMap("IsFirstOpenBw")
        public Long isFirstOpenBw;

        /**
         * <p>Indicates whether the metering method of the 95th percentile burstable QPS is enabled for the instance. Valid values:</p>
         * <br>
         * <p>- 0: no</p>
         * <p>- 1: yes</p>
         */
        @NameInMap("IsFirstOpenQps")
        public Long isFirstOpenQps;

        /**
         * <p>The remarks of the instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   **1**: normal</p>
         * <p>*   **2**: expired</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseBodyInstances setDebtStatus(Integer debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }
        public Integer getDebtStatus() {
            return this.debtStatus;
        }

        public DescribeInstancesResponseBodyInstances setEdition(Integer edition) {
            this.edition = edition;
            return this;
        }
        public Integer getEdition() {
            return this.edition;
        }

        public DescribeInstancesResponseBodyInstances setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseBodyInstances setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribeInstancesResponseBodyInstances setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstancesResponseBodyInstances setIsFirstOpenBw(Long isFirstOpenBw) {
            this.isFirstOpenBw = isFirstOpenBw;
            return this;
        }
        public Long getIsFirstOpenBw() {
            return this.isFirstOpenBw;
        }

        public DescribeInstancesResponseBodyInstances setIsFirstOpenQps(Long isFirstOpenQps) {
            this.isFirstOpenQps = isFirstOpenQps;
            return this;
        }
        public Long getIsFirstOpenQps() {
            return this.isFirstOpenQps;
        }

        public DescribeInstancesResponseBodyInstances setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstancesResponseBodyInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
