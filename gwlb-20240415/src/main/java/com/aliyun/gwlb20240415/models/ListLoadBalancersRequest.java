// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class ListLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>Ipv4</strong>: IPv4</li>
     * </ul>
     * <p>Enumeration values:</p>
     * <ul>
     * <li>IPv4: IPv4</li>
     * <li>DualStack: DualStack</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The business status of the GWLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: running as expected</li>
     * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBusinessStatus")
    public String loadBalancerBusinessStatus;

    /**
     * <p>The GWLB instance IDs. You can query at most 20 GWLB instances in each call.</p>
     */
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    /**
     * <p>The GWLB instance names. You can specify at most 20 GWLB instance names in each call.</p>
     */
    @NameInMap("LoadBalancerNames")
    public java.util.List<String> loadBalancerNames;

    /**
     * <p>The GWLB instance status. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: The GWLB instance is running.</li>
     * <li><strong>Inactive</strong>: The GWLB instance is disabled. Listeners of GWLB instances in the Inactive state do not forward traffic.</li>
     * <li><strong>Provisioning</strong>: The GWLB instance is being created.</li>
     * <li><strong>Configuring</strong>: The GWLB instance is being modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1000. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WyJyb290IiwibiIsIm4iLDEsMCwxNjg1MDY1NTgyNzYwLCI2NDcwMGY2ZTc2Zjc0MWFiZGEyZjQyNzc4ZDk2MmJkOTk3ZGZmM2Nm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2htf5qsyrn****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries to be skipped in the call.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>The tags. You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListLoadBalancersRequestTag> tag;

    @NameInMap("TrafficMode")
    public String trafficMode;

    /**
     * <p>The virtual private cloud (VPC) IDs. You can query at most 20 IDs in each call.</p>
     */
    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    /**
     * <p>The zone IDs. You can query at most 20 zone IDs in each call.</p>
     */
    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

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

    public ListLoadBalancersRequest setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
        this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
        return this;
    }
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
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

    public ListLoadBalancersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLoadBalancersRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListLoadBalancersRequest setTag(java.util.List<ListLoadBalancersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListLoadBalancersRequestTag> getTag() {
        return this.tag;
    }

    public ListLoadBalancersRequest setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
        return this;
    }
    public String getTrafficMode() {
        return this.trafficMode;
    }

    public ListLoadBalancersRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public ListLoadBalancersRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static class ListLoadBalancersRequestTag extends TeaModel {
        /**
         * <p>The tag key The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testTagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testTagValue</p>
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
