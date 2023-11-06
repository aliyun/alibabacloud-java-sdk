// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersRequest extends TeaModel {
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   **Internet**: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</p>
     * <p>*   **Intranet**: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC where the ALB instance is deployed.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("DNSName")
    public String DNSName;

    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The service status of the ALB instance. Valid values:</p>
     * <br>
     * <p>*   **Abnormal**</p>
     * <p>*   **Normal**</p>
     */
    @NameInMap("LoadBalancerBussinessStatus")
    public String loadBalancerBussinessStatus;

    /**
     * <p>The instance IDs. You can specify at most 20 ALB instance IDs.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The names of the instances. You can specify at most 10 names.</p>
     */
    @NameInMap("LoadBalancerNames")
    public java.util.List<String> loadBalancerNames;

    /**
     * <p>The status of the ALB instance. Valid values:</p>
     * <br>
     * <p>*   **Inactive**: The ALB instance is disabled. The listeners do not forward traffic.</p>
     * <p>*   **Active**: The ALB instance is running.</p>
     * <p>*   **Provisioning**: The ALB instance is being created.</p>
     * <p>*   **Configuring**: The ALB instance is being modified.</p>
     * <p>*   **CreateFailed**: The system failed to create the ALB instance. In this case, you are not charged for the ALB instance. You can only delete the ALB instance. By default, the system deletes the ALB instances that are in the CreateFailed state within the last day.</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method of the ALB instance. Set the value to</p>
     * <br>
     * <p>**PostPay**, which specifies the pay-as-you-go billing method. This is the default value.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags added to the ALB instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListLoadBalancersRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the ALB instance belongs. You can specify at most 10 IDs.</p>
     */
    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    /**
     * <p>The ID of the zone where the ALB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeZones](~~189196~~) operation to query zones.</p>
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
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
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
