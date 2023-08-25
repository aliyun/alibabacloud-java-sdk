// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesRequest extends TeaModel {
    /**
     * <p>The IP address that is allocated to the Anycast EIP.</p>
     */
    @NameInMap("AnycastEipAddress")
    public String anycastEipAddress;

    /**
     * <p>The ID of the Anycast EIP.</p>
     * <br>
     * <p>>  To ensure the accuracy of the query result, we do not recommend that you specify **AnycastIds** and **AnycastId** at the same time.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The IDs of Anycast EIPs.</p>
     * <br>
     * <p>You can enter at most 50 Anycast EIP IDs.</p>
     * <br>
     * <p>>  To ensure the accuracy of the query result, we do not recommend that you specify **AnycastIds** and **AnycastId** at the same time.</p>
     */
    @NameInMap("AnycastIds")
    public java.util.List<String> anycastIds;

    /**
     * <p>The IDs of the cloud resources with which the Anycast EIPs are associated.</p>
     * <br>
     * <p>You can enter at most 100 cloud resource IDs.</p>
     */
    @NameInMap("BindInstanceIds")
    public java.util.List<String> bindInstanceIds;

    /**
     * <p>The service status of the Anycast EIP. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **FinancialLocked**</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The billing method of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **PostPaid**, which specifies the pay-as-you-go billing method.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **PayByTraffic**, which specifies the pay-by-data-transfer metering method.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The number of entries to return on each page. Valid values: **20 to 100**. Default value: **50**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the Anycast EIP.</p>
     * <br>
     * <p>The name must be 0 to 128 characters in length, and can contain digits, hyphens (-), and underscores (\_). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The access area of the Anycast EIP.</p>
     * <br>
     * <p>Set the value to **international**, which specifies the regions outside the Chinese mainland.</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    /**
     * <p>The status of the Anycast EIP. Valid values:</p>
     * <br>
     * <p>*   **Associating**</p>
     * <p>*   **Unassociating**</p>
     * <p>*   **Allocated**</p>
     * <p>*   **Associated**</p>
     * <p>*   **Modifying**</p>
     * <p>*   **Releasing**</p>
     * <p>*   **Released**</p>
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
         * <br>
         * <p>The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>>  You must specify at least one of **Tag.N** (**Tag.N.Key** and **Tag.N.Value**).</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. It can be an empty string.</p>
         * <br>
         * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>>  You must specify at least one of **Tag.N** (**Tag.N.Key** and **Tag.N.Value**).</p>
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
