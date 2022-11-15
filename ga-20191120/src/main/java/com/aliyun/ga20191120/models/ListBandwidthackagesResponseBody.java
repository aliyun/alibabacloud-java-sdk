// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthackagesResponseBody extends TeaModel {
    @NameInMap("BandwidthPackages")
    public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> bandwidthPackages;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBandwidthackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthackagesResponseBody self = new ListBandwidthackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBandwidthackagesResponseBody setBandwidthPackages(java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public ListBandwidthackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBandwidthackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBandwidthackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBandwidthackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBandwidthackagesResponseBodyBandwidthPackagesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListBandwidthackagesResponseBodyBandwidthPackagesTags build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthackagesResponseBodyBandwidthPackagesTags self = new ListBandwidthackagesResponseBodyBandwidthPackagesTags();
            return TeaModel.build(map, self);
        }

        public ListBandwidthackagesResponseBodyBandwidthPackagesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackagesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBandwidthackagesResponseBodyBandwidthPackages extends TeaModel {
        @NameInMap("Accelerators")
        public java.util.List<String> accelerators;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("State")
        public String state;

        @NameInMap("Tags")
        public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> tags;

        public static ListBandwidthackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthackagesResponseBodyBandwidthPackages self = new ListBandwidthackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setAccelerators(java.util.List<String> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<String> getAccelerators() {
            return this.accelerators;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setTags(java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> getTags() {
            return this.tags;
        }

    }

}
