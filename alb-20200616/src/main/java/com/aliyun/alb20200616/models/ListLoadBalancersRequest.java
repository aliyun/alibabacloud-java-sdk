// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4.</li>
     * <li><strong>DualStack</strong>: dual-stack.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The address type of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The load balancing has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The load balancing has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing resides.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The DNS domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The IPv6 address type of the application load balancing instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The load balancing has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The load balancing has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing resides.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The business status of the application load balancing instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Abnormal</strong>: Abnormal.</p>
     * </li>
     * <li><p><strong>Normal</strong>: Normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBussinessStatus")
    public String loadBalancerBussinessStatus;

    /**
     * <p>The IDs of the instances. You can specify up to 20 application load balancing instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The names of the instances. You can specify up to 10 instance names.</p>
     */
    @NameInMap("LoadBalancerNames")
    public java.util.List<String> loadBalancerNames;

    /**
     * <p>The instance status of the application load balancing instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Inactive</strong>: The instance is stopped and listeners no longer forward traffic.</p>
     * </li>
     * <li><p><strong>Active</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>Provisioning</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: Upgrade/Downgrade in progress.</p>
     * </li>
     * <li><p><strong>CreateFailed</strong>: The instance failed to be created. In this case, no fees are generated and the instance can only be deleted. By default, the system cleans up instances that failed to be created within the last 24 hours.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Valid values:</p>
     * <ul>
     * <li>Leave this parameter empty for the first query or when no next query is required.</li>
     * <li>If a next query is required, set the value to the <strong>NextToken</strong> value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <p><strong>PostPay</strong> (default value): pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance label.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListLoadBalancersRequestTag> tag;

    /**
     * <p>The IDs of the VPCs to which the application load balancing instances belong. You can specify up to 10 VPC IDs.</p>
     */
    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    /**
     * <p>The ID of the active zone where the application load balancing instance resides.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the active zone information corresponding to the active zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersRequest self = new ListLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersRequest setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public ListLoadBalancersRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ListLoadBalancersRequest setDNSName(String DNSName) {
        this.DNSName = DNSName;
        return this;
    }
    public String getDNSName() {
        return this.DNSName;
    }

    public ListLoadBalancersRequest setIpv6AddressType(String ipv6AddressType) {
        this.ipv6AddressType = ipv6AddressType;
        return this;
    }
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    public ListLoadBalancersRequest setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
        this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
        return this;
    }
    public String getLoadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }

    public ListLoadBalancersRequest setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public ListLoadBalancersRequest setLoadBalancerNames(java.util.List<String> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
        return this;
    }
    public java.util.List<String> getLoadBalancerNames() {
        return this.loadBalancerNames;
    }

    public ListLoadBalancersRequest setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public ListLoadBalancersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLoadBalancersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLoadBalancersRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ListLoadBalancersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLoadBalancersRequest setTag(java.util.List<ListLoadBalancersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListLoadBalancersRequestTag> getTag() {
        return this.tag;
    }

    public ListLoadBalancersRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public ListLoadBalancersRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListLoadBalancersRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>alueTest</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLoadBalancersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersRequestTag self = new ListLoadBalancersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLoadBalancersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
