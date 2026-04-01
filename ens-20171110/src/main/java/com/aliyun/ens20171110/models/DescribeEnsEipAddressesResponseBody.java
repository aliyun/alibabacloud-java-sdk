// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsEipAddressesResponseBody extends TeaModel {
    /**
     * <p>Details of the EIPs.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;106.14.194.193\&quot;]</p>
     */
    @NameInMap("EipAddresses")
    public DescribeEnsEipAddressesResponseBodyEipAddresses eipAddresses;

    /**
     * <p>The page number. Valid values: an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8629F679-B51D-4194-A1CC-5D8F504C362B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEnsEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsEipAddressesResponseBody self = new DescribeEnsEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsEipAddressesResponseBody setEipAddresses(DescribeEnsEipAddressesResponseBodyEipAddresses eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public DescribeEnsEipAddressesResponseBodyEipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeEnsEipAddressesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsEipAddressesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag extends TeaModel {
        /**
         * <p>标签键</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        @Deprecated
        public String tagKey;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        @Deprecated
        public String tagValue;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag self = new DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        @Deprecated
        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        @Deprecated
        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag> tag;

        public static DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags self = new DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags setTag(java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress extends TeaModel {
        /**
         * <p>EIP的实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>eip-5sainglpw7qfem3icir4s****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>EIP的创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1624885274000</p>
         */
        @NameInMap("AllocationTime")
        public String allocationTime;

        /**
         * <p>EIP的带宽峰值，默认值为5。取值范围：<strong>5</strong>~<strong>10000</strong>，单位：Mbps。</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>EIP的计费模式。</p>
         * <ul>
         * <li><p><strong>PrePaid</strong>：包年包月。</p>
         * </li>
         * <li><p><strong>PostPaid</strong>：按量计费。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>EIP的描述信息。</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ENS节点ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-telecom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("IcmpReplyEnabled")
        public Boolean icmpReplyEnabled;

        /**
         * <p>当前绑定的实例的ID。</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5sc3kum2e0sz34wbqrws9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>要绑定的云产品实例的类型，取值： </p>
         * <ul>
         * <li><p><strong>EnsInstance</strong>：VPC类型的ENS实例。</p>
         * </li>
         * <li><p><strong>SlbInstance</strong>：负载均衡实例。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>EIP的计费方式。</p>
         * <ul>
         * <li><p><strong>95BandwidthByMonth</strong>：月95峰值带宽。</p>
         * </li>
         * <li><p><strong>PayByBandwidth</strong>：固定带宽计费。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>EIP的IP地址。</p>
         * 
         * <strong>example:</strong>
         * <p>120.XXX.XXX.4</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>如果该弹性IP是备用EIP时，表示当前EIP的运行状态。</p>
         * <ul>
         * <li><strong>Stopped</strong>：已停止。</li>
         * <li><strong>Running</strong>：运行中。</li>
         * <li><strong>Starting</strong>：启动中。</li>
         * <li><strong>Stopping</strong>：停止中。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("IpStatus")
        public String ipStatus;

        /**
         * <p>运营商，取值：</p>
         * <ul>
         * <li><strong>cmcc</strong>：中国移动。</li>
         * <li><strong>unicom</strong>：中国联通。</li>
         * <li><strong>telecom</strong>：中国电信。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>EIP实例名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>该EIP是否是备用。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Standby")
        public Boolean standby;

        /**
         * <p>EIP的状态。</p>
         * <ul>
         * <li><p><strong>Associating</strong>：绑定中。</p>
         * </li>
         * <li><p><strong>Unassociating</strong>：解绑中。   </p>
         * </li>
         * <li><p><strong>InUse</strong>：已分配。   </p>
         * </li>
         * <li><p><strong>Available</strong>：可用。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>标签集合。</p>
         */
        @NameInMap("Tags")
        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags tags;

        public static DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress self = new DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setAllocationTime(String allocationTime) {
            this.allocationTime = allocationTime;
            return this;
        }
        public String getAllocationTime() {
            return this.allocationTime;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIcmpReplyEnabled(Boolean icmpReplyEnabled) {
            this.icmpReplyEnabled = icmpReplyEnabled;
            return this;
        }
        public Boolean getIcmpReplyEnabled() {
            return this.icmpReplyEnabled;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIpStatus(String ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public String getIpStatus() {
            return this.ipStatus;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setStandby(Boolean standby) {
            this.standby = standby;
            return this;
        }
        public Boolean getStandby() {
            return this.standby;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress setTags(DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeEnsEipAddressesResponseBodyEipAddressesEipAddressTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeEnsEipAddressesResponseBodyEipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> eipAddress;

        public static DescribeEnsEipAddressesResponseBodyEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsEipAddressesResponseBodyEipAddresses self = new DescribeEnsEipAddressesResponseBodyEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeEnsEipAddressesResponseBodyEipAddresses setEipAddress(java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public java.util.List<DescribeEnsEipAddressesResponseBodyEipAddressesEipAddress> getEipAddress() {
            return this.eipAddress;
        }

    }

}
