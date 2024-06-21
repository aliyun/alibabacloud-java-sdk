// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponseBody extends TeaModel {
    /**
     * <p>The details about the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>381D5D33-BB8F-395F-8EE4-AE3BB4B523C4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of Anti-DDoS Origin instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListResponseBody self = new DescribeInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListResponseBody setInstanceList(java.util.List<DescribeInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeInstanceListResponseBodyInstanceListAutoProtectCondition extends TeaModel {
        @NameInMap("Events")
        public java.util.List<String> events;

        public static DescribeInstanceListResponseBodyInstanceListAutoProtectCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseBodyInstanceListAutoProtectCondition self = new DescribeInstanceListResponseBodyInstanceListAutoProtectCondition();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseBodyInstanceListAutoProtectCondition setEvents(java.util.List<String> events) {
            this.events = events;
            return this;
        }
        public java.util.List<String> getEvents() {
            return this.events;
        }

    }

    public static class DescribeInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("AutoProtectCondition")
        public DescribeInstanceListResponseBodyInstanceListAutoProtectCondition autoProtectCondition;

        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The number of protected public IP addresses for which blackhole filtering is triggered.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118692.html">DeleteBlackhole</a> operation to deactivate blackhole filtering for a protected IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlackholdingCount")
        public String blackholdingCount;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("CoverageType")
        public Integer coverageType;

        /**
         * <p>The time when the instance expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640275200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The time when the instance was purchased. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1592886047000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-oew1pjrk****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The mitigation plan of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the Professional mitigation plan</li>
         * <li><strong>1</strong>: the Enterprise mitigation plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The protocol type of the IP address asset that is protected by the instance. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4</li>
         * <li><strong>Ipv6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The type of the cloud service that is associated with the Anti-DDoS Origin instance. By default, this parameter is not returned. If the Anti-DDoS Origin instance is created by using a different cloud service, the code of the cloud service is returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>gamebox</strong>: The Anti-DDoS Origin instance is created by using Game Security Box.</li>
         * <li><strong>eip</strong>: The Anti-DDoS Origin instance is created by using an elastic IP address (EIP) for which Anti-DDoS (Enhanced Edition) is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gamebox</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The remarks of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: normal</li>
         * <li><strong>2</strong>: expired</li>
         * <li><strong>3</strong>: released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListResponseBodyInstanceList self = new DescribeInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListResponseBodyInstanceList setAutoProtectCondition(DescribeInstanceListResponseBodyInstanceListAutoProtectCondition autoProtectCondition) {
            this.autoProtectCondition = autoProtectCondition;
            return this;
        }
        public DescribeInstanceListResponseBodyInstanceListAutoProtectCondition getAutoProtectCondition() {
            return this.autoProtectCondition;
        }

        public DescribeInstanceListResponseBodyInstanceList setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceListResponseBodyInstanceList setBlackholdingCount(String blackholdingCount) {
            this.blackholdingCount = blackholdingCount;
            return this;
        }
        public String getBlackholdingCount() {
            return this.blackholdingCount;
        }

        public DescribeInstanceListResponseBodyInstanceList setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public DescribeInstanceListResponseBodyInstanceList setCoverageType(Integer coverageType) {
            this.coverageType = coverageType;
            return this;
        }
        public Integer getCoverageType() {
            return this.coverageType;
        }

        public DescribeInstanceListResponseBodyInstanceList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceListResponseBodyInstanceList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceListResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceListResponseBodyInstanceList setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeInstanceListResponseBodyInstanceList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeInstanceListResponseBodyInstanceList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeInstanceListResponseBodyInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
