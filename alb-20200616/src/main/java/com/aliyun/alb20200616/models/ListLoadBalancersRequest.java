// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersRequest extends TeaModel {
    /**
     * <p>The protocol version. Valid values:</p>
     * <ul>
     * <li><p><strong>IPv4</strong>: IPv4</p>
     * </li>
     * <li><p><strong>DualStack</strong>: dual-stack</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The type of the IP address that the Application Load Balancer instance uses to provide services. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed in the VPC where the ALB instance is deployed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The type of the IPv6 address that the Application Load Balancer instance uses to provide services. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</p>
     * </li>
     * <li><p><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed in the VPC where the ALB instance is deployed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The service status of the Application Load Balancer instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Abnormal</strong>: The instance is not working as expected.</p>
     * </li>
     * <li><p><strong>Normal</strong>: The instance is working as expected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBussinessStatus")
    public String loadBalancerBussinessStatus;

    /**
     * <p>The instance IDs. You can specify up to 20 Application Load Balancer instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The instance names. You can specify up to 10 instance names.</p>
     */
    @NameInMap("LoadBalancerNames")
    public java.util.List<String> loadBalancerNames;

    /**
     * <p>The state of the Application Load Balancer instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Inactive</strong>: The instance is disabled. Listeners of the instance do not forward traffic.</p>
     * </li>
     * <li><p><strong>Active</strong>: The instance is running.</p>
     * </li>
     * <li><p><strong>Provisioning</strong>: The instance is being created.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The instance is being configured.</p>
     * </li>
     * <li><p><strong>CreateFailed</strong>: The instance failed to be created. You are not charged for the instance. You can only delete the instance. The system automatically deletes instances that failed to be created within one day.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li><p>You do not need to specify this parameter for the first request.</p>
     * </li>
     * <li><p>If a subsequent call is required, set the value to the <strong>NextToken</strong> value returned from the previous call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method of the instance. Valid value:</p>
     * <p><strong>PostPay</strong> (default): The instance is billed on a pay-as-you-go basis.</p>
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
     * <p>The tags of the instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListLoadBalancersRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the Application Load Balancer instance belongs. You can specify up to 10 VPC IDs.</p>
     */
    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    /**
     * <p>The ID of the zone where the Application Load Balancer instance is deployed.</p>
     * <p>You can call the <a href="t2324479.xdita#"></a>operation to query information about the zones.</p>
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
