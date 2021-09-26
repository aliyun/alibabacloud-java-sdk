// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BusinessLocations")
    public java.util.List<DescribeRegionsResponseBodyBusinessLocations> businessLocations;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setBusinessLocations(java.util.List<DescribeRegionsResponseBodyBusinessLocations> businessLocations) {
        this.businessLocations = businessLocations;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyBusinessLocations> getBusinessLocations() {
        return this.businessLocations;
    }

    public static class DescribeRegionsResponseBodyBusinessLocationsDistrict extends TeaModel {
        @NameInMap("Ordering")
        public String ordering;

        @NameInMap("CnName")
        public String cnName;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("DistrictId")
        public String districtId;

        @NameInMap("EnName")
        public String enName;

        public static DescribeRegionsResponseBodyBusinessLocationsDistrict build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyBusinessLocationsDistrict self = new DescribeRegionsResponseBodyBusinessLocationsDistrict();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyBusinessLocationsDistrict setOrdering(String ordering) {
            this.ordering = ordering;
            return this;
        }
        public String getOrdering() {
            return this.ordering;
        }

        public DescribeRegionsResponseBodyBusinessLocationsDistrict setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public DescribeRegionsResponseBodyBusinessLocationsDistrict setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public DescribeRegionsResponseBodyBusinessLocationsDistrict setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public DescribeRegionsResponseBodyBusinessLocationsDistrict setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

    }

    public static class DescribeRegionsResponseBodyBusinessLocations extends TeaModel {
        @NameInMap("Ordering")
        public String ordering;

        @NameInMap("Type")
        public String type;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnDescription")
        public String enDescription;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("CnName")
        public String cnName;

        @NameInMap("Name")
        public String name;

        @NameInMap("District")
        public DescribeRegionsResponseBodyBusinessLocationsDistrict district;

        public static DescribeRegionsResponseBodyBusinessLocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyBusinessLocations self = new DescribeRegionsResponseBodyBusinessLocations();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyBusinessLocations setOrdering(String ordering) {
            this.ordering = ordering;
            return this;
        }
        public String getOrdering() {
            return this.ordering;
        }

        public DescribeRegionsResponseBodyBusinessLocations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRegionsResponseBodyBusinessLocations setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public DescribeRegionsResponseBodyBusinessLocations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRegionsResponseBodyBusinessLocations setEnDescription(String enDescription) {
            this.enDescription = enDescription;
            return this;
        }
        public String getEnDescription() {
            return this.enDescription;
        }

        public DescribeRegionsResponseBodyBusinessLocations setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeRegionsResponseBodyBusinessLocations setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public DescribeRegionsResponseBodyBusinessLocations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRegionsResponseBodyBusinessLocations setDistrict(DescribeRegionsResponseBodyBusinessLocationsDistrict district) {
            this.district = district;
            return this;
        }
        public DescribeRegionsResponseBodyBusinessLocationsDistrict getDistrict() {
            return this.district;
        }

    }

}
