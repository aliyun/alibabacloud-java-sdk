// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the account to which the Anycast EIP belongs.</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The information about the endpoint with which the Anycast EIP is associated.</p>
     */
    @NameInMap("AnycastEipBindInfoList")
    public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> anycastEipBindInfoList;

    /**
     * <p>The ID of the Anycast EIP.</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The BID of the account to which the Anycast EIP belongs.</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>The service status of the Anycast EIP. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **FinancialLocked**</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The point in time at which the Anycast EIP was created.</p>
     * <br>
     * <p>The time follows the ISO8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the Anycast EIP.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The billing method of the Anycast EIP.</p>
     * <br>
     * <p>Only **PostPaid** may be returned, which indicates the pay-as-you-go billing method.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the Anycast EIP.</p>
     * <br>
     * <p>Only **PayByTraffic** may be returned, which indicates the pay-by-data-transfer metering method.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the Anycast EIP.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The name of the Anycast EIP.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The access area of the Anycast EIP.</p>
     * <br>
     * <p>Only **international** may be returned, which indicates the areas outside the Chinese mainland.</p>
     */
    @NameInMap("ServiceLocation")
    public String serviceLocation;

    /**
     * <p>The status of the Anycast EIP.</p>
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
     * <p>The information about the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeAnycastEipAddressResponseBodyTags> tags;

    public static DescribeAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressResponseBody self = new DescribeAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeAnycastEipAddressResponseBody setAnycastEipBindInfoList(java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> anycastEipBindInfoList) {
        this.anycastEipBindInfoList = anycastEipBindInfoList;
        return this;
    }
    public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList> getAnycastEipBindInfoList() {
        return this.anycastEipBindInfoList;
    }

    public DescribeAnycastEipAddressResponseBody setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public DescribeAnycastEipAddressResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeAnycastEipAddressResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeAnycastEipAddressResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeAnycastEipAddressResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeAnycastEipAddressResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAnycastEipAddressResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAnycastEipAddressResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeAnycastEipAddressResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeAnycastEipAddressResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnycastEipAddressResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAnycastEipAddressResponseBody setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public DescribeAnycastEipAddressResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAnycastEipAddressResponseBody setTags(java.util.List<DescribeAnycastEipAddressResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeAnycastEipAddressResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations extends TeaModel {
        /**
         * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
         * <br>
         * <p>If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.</p>
         */
        @NameInMap("PopLocation")
        public String popLocation;

        public static DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations self = new DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

    public static class DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList extends TeaModel {
        /**
         * <p>The association mode. Valid values:</p>
         * <br>
         * <p>*   **Default**: the default mode. In this mode, the associated endpoint serves as the default origin server.</p>
         * <p>*   **Normal**: the standard mode. In this mode, the associated endpoint serves as a standard origin server.</p>
         */
        @NameInMap("AssociationMode")
        public String associationMode;

        /**
         * <p>The ID of the endpoint with which the Anycast EIP is associated.</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The ID of the region in which the endpoint is deployed.</p>
         */
        @NameInMap("BindInstanceRegionId")
        public String bindInstanceRegionId;

        /**
         * <p>The type of endpoint with which the Anycast EIP is associated. Valid values:</p>
         * <br>
         * <p>*   **SlbInstance**: a CLB instance in a VPC.</p>
         * <p>*   **NetworkInterface**: an elastic network interface (ENI).</p>
         */
        @NameInMap("BindInstanceType")
        public String bindInstanceType;

        /**
         * <p>The time when the Anycast EIP was associated.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("BindTime")
        public String bindTime;

        /**
         * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
         * <br>
         * <p>If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.</p>
         */
        @NameInMap("PopLocations")
        public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> popLocations;

        /**
         * <p>The secondary private IP address of the associated ENI.</p>
         * <br>
         * <p>This parameter is valid only when **BindInstanceType** is set to **NetworkInterface**.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **BINDING**</p>
         * <p>*   **BINDED**</p>
         * <p>*   **UNBINDING**</p>
         * <p>*   **DELETED**</p>
         * <p>*   **MODIFYING**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList self = new DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setAssociationMode(String associationMode) {
            this.associationMode = associationMode;
            return this;
        }
        public String getAssociationMode() {
            return this.associationMode;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceRegionId(String bindInstanceRegionId) {
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }
        public String getBindInstanceRegionId() {
            return this.bindInstanceRegionId;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindInstanceType(String bindInstanceType) {
            this.bindInstanceType = bindInstanceType;
            return this;
        }
        public String getBindInstanceType() {
            return this.bindInstanceType;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setPopLocations(java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> popLocations) {
            this.popLocations = popLocations;
            return this;
        }
        public java.util.List<DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoListPopLocations> getPopLocations() {
            return this.popLocations;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeAnycastEipAddressResponseBodyAnycastEipBindInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAnycastEipAddressResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAnycastEipAddressResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastEipAddressResponseBodyTags self = new DescribeAnycastEipAddressResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastEipAddressResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAnycastEipAddressResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
