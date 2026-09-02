// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListResponseBody extends TeaModel {
    /**
     * <p>The details of the Anti-DDoS Origin instances.</p>
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
     * <p>The total number of Anti-DDoS Origin instances returned.</p>
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
        /**
         * <p>The events on which automatic binding is based.</p>
         */
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
        /**
         * <p>The automatic binding condition.</p>
         */
        @NameInMap("AutoProtectCondition")
        public DescribeInstanceListResponseBodyInstanceListAutoProtectCondition autoProtectCondition;

        /**
         * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The number of IP addresses that are in blackhole filtering status among the assets that are assigned public IP addresses protected by the instance.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/118692.html">DeleteBlackhole</a> to deactivate blackhole filtering for a single protected IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlackholdingCount")
        public String blackholdingCount;

        /**
         * <p>The commodity type of the instance.</p>
         * <ul>
         * <li><strong>ddos_ddosorigin_public_cn</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) China site.</li>
         * <li><strong>ddos_ddosorigin_public_intl</strong>: Anti-DDoS Origin 2.0 (Pay-as-you-go) International site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ddos_ddosorigin_public_cn</p>
         */
        @NameInMap("CommodityType")
        public String commodityType;

        /**
         * <p>The asset overwrite type of the instance.</p>
         * <ul>
         * <li><strong>1</strong>: Supports assets that are assigned public IP addresses in multiple regions globally.</li>
         * <li><strong>2</strong>: Supports assets that are assigned public IP addresses in multiple regions in the Chinese mainland.</li>
         * <li><strong>3</strong>: Supports assets that are assigned public IP addresses in multiple regions outside the Chinese mainland.</li>
         * <li><strong>4</strong>: Supports assets that are assigned public IP addresses in a single region globally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CoverageType")
        public Integer coverageType;

        /**
         * <p>The overdue payment status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No overdue payment.</li>
         * <li><strong>1</strong>: Overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DebtStatus")
        public Long debtStatus;

        /**
         * <p>The expiration time of the instance. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640275200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The purchase time of the instance. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1592886047000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-oew1pjrk****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The mitigation plan type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Professional.</li>
         * <li><strong>1</strong>: Enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The protocol type of the IP assets protected by the instance. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: IPv4 protocol.</li>
         * <li><strong>IPv6</strong>: IPv6 protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The full logs property.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;mitigationAnalysis\&quot;:\&quot;on\&quot;,\&quot;mitigationAnalysisCapacity\&quot;:1,\&quot;ttl\&quot;:180}</p>
         */
        @NameInMap("LogExt")
        public String logExt;

        /**
         * <p>The type of the cloud service associated with the instance. This parameter is not returned by default. It is returned only when the Anti-DDoS Origin instance is created by another cloud service, with the corresponding cloud service code.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>gamebox</strong>: The Anti-DDoS Origin instance is created by Game Security Box.</li>
         * <li><strong>eip</strong>: The Anti-DDoS Origin instance is created by an EIP with Anti-DDoS (Enhanced) enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gamebox</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The remark of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3ccjxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Normal.</li>
         * <li><strong>2</strong>: Expired.</li>
         * <li><strong>3</strong>: Released.</li>
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

        public DescribeInstanceListResponseBodyInstanceList setDebtStatus(Long debtStatus) {
            this.debtStatus = debtStatus;
            return this;
        }
        public Long getDebtStatus() {
            return this.debtStatus;
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

        public DescribeInstanceListResponseBodyInstanceList setLogExt(String logExt) {
            this.logExt = logExt;
            return this;
        }
        public String getLogExt() {
            return this.logExt;
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

        public DescribeInstanceListResponseBodyInstanceList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
