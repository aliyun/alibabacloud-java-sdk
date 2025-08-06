// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesResponseBody extends TeaModel {
    /**
     * <p>The list of Anycast EIPs.</p>
     */
    @NameInMap("AnycastList")
    public java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> anycastList;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If <strong>NextToken</strong> is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAnycastEipAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesResponseBody self = new ListAnycastEipAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesResponseBody setAnycastList(java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> anycastList) {
        this.anycastList = anycastList;
        return this;
    }
    public java.util.List<ListAnycastEipAddressesResponseBodyAnycastList> getAnycastList() {
        return this.anycastList;
    }

    public ListAnycastEipAddressesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnycastEipAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnycastEipAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList extends TeaModel {
        /**
         * <p>The ID of the cloud resource with which the Anycast EIP is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zebb08phyczzawe****</p>
         */
        @NameInMap("BindInstanceId")
        public String bindInstanceId;

        /**
         * <p>The ID of the region where the cloud resource is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1</p>
         */
        @NameInMap("BindInstanceRegionId")
        public String bindInstanceRegionId;

        /**
         * <p>The type of cloud resource with which the Anycast EIP is associated.</p>
         * <ul>
         * <li><strong>SlbInstance</strong>: an internal-facing Classic Load Balancer (CLB) instance deployed in a virtual private cloud (VPC). CLB is formerly known as Server Load Balancer (SLB).</li>
         * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SlbInstance</p>
         */
        @NameInMap("BindInstanceType")
        public String bindInstanceType;

        /**
         * <p>The time when the Anycast EIP was associated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-23T01:37:38Z</p>
         */
        @NameInMap("BindTime")
        public String bindTime;

        public static ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList self = new ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceId(String bindInstanceId) {
            this.bindInstanceId = bindInstanceId;
            return this;
        }
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceRegionId(String bindInstanceRegionId) {
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }
        public String getBindInstanceRegionId() {
            return this.bindInstanceRegionId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindInstanceType(String bindInstanceType) {
            this.bindInstanceType = bindInstanceType;
            return this;
        }
        public String getBindInstanceType() {
            return this.bindInstanceType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

    }

    public static class ListAnycastEipAddressesResponseBodyAnycastListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAnycastEipAddressesResponseBodyAnycastListTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastListTags self = new ListAnycastEipAddressesResponseBodyAnycastListTags();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAnycastEipAddressesResponseBodyAnycastListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAnycastEipAddressesResponseBodyAnycastList extends TeaModel {
        /**
         * <p>The ID of the account to which the Anycast EIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123440159596****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The list of cloud resources with which the Anycast EIPs are associated.</p>
         */
        @NameInMap("AnycastEipBindInfoList")
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> anycastEipBindInfoList;

        /**
         * <p>The ID of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>aeip-2zeerraiwb7ujsxdc****</p>
         */
        @NameInMap("AnycastId")
        public String anycastId;

        /**
         * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

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
         * <p>The time when the Anycast EIP was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-22T01:37:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>docdesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The billing method of the Anycast EIP.</p>
         * <p><strong>PostPaid</strong>: pay-as-you-go</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the Anycast EIP.</p>
         * <p><strong>PayByTraffic</strong>: pay-by-data-transfer</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The IP address of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>139.95.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The name of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>docname</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <p><strong>international</strong>: regions outside the Chinese mainland</p>
         * 
         * <strong>example:</strong>
         * <p>international</p>
         */
        @NameInMap("ServiceLocation")
        public String serviceLocation;

        /**
         * <p>Indicates whether the resource is created by the service account.</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceManaged")
        public Integer serviceManaged;

        /**
         * <p>The status of the Anycast EIP.</p>
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
         * <p>Associating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> tags;

        public static ListAnycastEipAddressesResponseBodyAnycastList build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesResponseBodyAnycastList self = new ListAnycastEipAddressesResponseBodyAnycastList();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAnycastEipBindInfoList(java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> anycastEipBindInfoList) {
            this.anycastEipBindInfoList = anycastEipBindInfoList;
            return this;
        }
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListAnycastEipBindInfoList> getAnycastEipBindInfoList() {
            return this.anycastEipBindInfoList;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setAnycastId(String anycastId) {
            this.anycastId = anycastId;
            return this;
        }
        public String getAnycastId() {
            return this.anycastId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setServiceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setServiceManaged(Integer serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAnycastEipAddressesResponseBodyAnycastList setTags(java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAnycastEipAddressesResponseBodyAnycastListTags> getTags() {
            return this.tags;
        }

    }

}
