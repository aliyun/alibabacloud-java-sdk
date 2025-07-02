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
        @NameInMap("Key")
        public String key;

        @NameInMap("TagKey")
        @Deprecated
        public String tagKey;

        @NameInMap("TagValue")
        @Deprecated
        public String tagValue;

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
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("AllocationTime")
        public String allocationTime;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("IpStatus")
        public String ipStatus;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Standby")
        public Boolean standby;

        @NameInMap("Status")
        public String status;

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
