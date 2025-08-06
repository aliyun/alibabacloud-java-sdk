// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesRequest extends TeaModel {
    /**
     * <p>The IP address that is allocated to the Anycast EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>139.95.XX.XX</p>
     */
    @NameInMap("AnycastEipAddress")
    public String anycastEipAddress;

    /**
     * <p>The ID of the Anycast EIP.</p>
     * <blockquote>
     * <p> To ensure the accuracy of the query result, we do not recommend that you specify <strong>AnycastIds</strong> and <strong>AnycastId</strong> at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aeip-2zeerraiwb7ujsxdc****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The IDs of Anycast EIPs.</p>
     * <p>You can enter at most 50 Anycast EIP IDs.</p>
     * <blockquote>
     * <p> To ensure the accuracy of the query result, we do not recommend that you specify <strong>AnycastIds</strong> and <strong>AnycastId</strong> at the same time.</p>
     * </blockquote>
     */
    @NameInMap("AnycastIds")
    public java.util.List<String> anycastIds;

    /**
     * <p>The IDs of the cloud resources with which the Anycast EIPs are associated.</p>
     * <p>You can enter at most 100 cloud resource IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zebb08phyczzawe****</p>
     */
    @NameInMap("BindInstanceIds")
    public java.util.List<String> bindInstanceIds;

    /**
     * <p>The service status of the Anycast EIP. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>FinancialLocked</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The billing method of the Anycast EIP.</p>
     * <p>Set the value to <strong>PostPaid</strong>, which specifies the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Anycast EIP.</p>
     * <p>Set the value to <strong>PayByTraffic</strong>, which specifies the pay-by-data-transfer metering method.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>20 to 100</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the Anycast EIP.</p>
     * <p>The name must be 0 to 128 characters in length, and can contain digits, hyphens (-), and underscores (_). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzthsmwsnfuni</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The access area of the Anycast EIP.</p>
     * <p>Set the value to <strong>international</strong>, which specifies the regions outside the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>international</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    /**
     * <p>The status of the Anycast EIP. Valid values:</p>
     * <ul>
     * <li><strong>Associating</strong></li>
     * <li><strong>Unassociating</strong></li>
     * <li><strong>Allocated</strong></li>
     * <li><strong>Associated</strong></li>
     * <li><strong>Modifying</strong></li>
     * <li><strong>Releasing</strong></li>
     * <li><strong>Released</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Associated</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListAnycastEipAddressesRequestTags> tags;

    public static ListAnycastEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesRequest self = new ListAnycastEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesRequest setAnycastEipAddress(String anycastEipAddress) {
        this.anycastEipAddress = anycastEipAddress;
        return this;
    }
    public String getAnycastEipAddress() {
        return this.anycastEipAddress;
    }

    public ListAnycastEipAddressesRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ListAnycastEipAddressesRequest setAnycastIds(java.util.List<String> anycastIds) {
        this.anycastIds = anycastIds;
        return this;
    }
    public java.util.List<String> getAnycastIds() {
        return this.anycastIds;
    }

    public ListAnycastEipAddressesRequest setBindInstanceIds(java.util.List<String> bindInstanceIds) {
        this.bindInstanceIds = bindInstanceIds;
        return this;
    }
    public java.util.List<String> getBindInstanceIds() {
        return this.bindInstanceIds;
    }

    public ListAnycastEipAddressesRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ListAnycastEipAddressesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ListAnycastEipAddressesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ListAnycastEipAddressesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAnycastEipAddressesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAnycastEipAddressesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnycastEipAddressesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAnycastEipAddressesRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public ListAnycastEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAnycastEipAddressesRequest setTags(java.util.List<ListAnycastEipAddressesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListAnycastEipAddressesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListAnycastEipAddressesRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. You cannot specify empty strings as tag keys.</p>
         * <p>The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p> You must specify at least one of <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. It can be an empty string.</p>
         * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). The value must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p> You must specify at least one of <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAnycastEipAddressesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesRequestTags self = new ListAnycastEipAddressesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAnycastEipAddressesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
