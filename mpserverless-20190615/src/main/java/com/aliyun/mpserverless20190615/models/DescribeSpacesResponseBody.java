// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpacesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spaces")
    public java.util.List<DescribeSpacesResponseBodySpaces> spaces;

    public static DescribeSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpacesResponseBody self = new DescribeSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpacesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSpacesResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpacesResponseBody setSpaces(java.util.List<DescribeSpacesResponseBodySpaces> spaces) {
        this.spaces = spaces;
        return this;
    }
    public java.util.List<DescribeSpacesResponseBodySpaces> getSpaces() {
        return this.spaces;
    }

    public static class DescribeSpacesResponseBodySpaces extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Description")
        public String description;

        @NameInMap("EmasWorkspaceId")
        public Long emasWorkspaceId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PackageEndDate")
        public String packageEndDate;

        @NameInMap("PackageStartDate")
        public String packageStartDate;

        @NameInMap("PackageStatus")
        public String packageStatus;

        @NameInMap("RenewDuration")
        public String renewDuration;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("SpecCode")
        public String specCode;

        public static DescribeSpacesResponseBodySpaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpacesResponseBodySpaces self = new DescribeSpacesResponseBodySpaces();
            return TeaModel.build(map, self);
        }

        public DescribeSpacesResponseBodySpaces setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeSpacesResponseBodySpaces setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeSpacesResponseBodySpaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSpacesResponseBodySpaces setEmasWorkspaceId(Long emasWorkspaceId) {
            this.emasWorkspaceId = emasWorkspaceId;
            return this;
        }
        public Long getEmasWorkspaceId() {
            return this.emasWorkspaceId;
        }

        public DescribeSpacesResponseBodySpaces setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSpacesResponseBodySpaces setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSpacesResponseBodySpaces setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSpacesResponseBodySpaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSpacesResponseBodySpaces setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribeSpacesResponseBodySpaces setPackageEndDate(String packageEndDate) {
            this.packageEndDate = packageEndDate;
            return this;
        }
        public String getPackageEndDate() {
            return this.packageEndDate;
        }

        public DescribeSpacesResponseBodySpaces setPackageStartDate(String packageStartDate) {
            this.packageStartDate = packageStartDate;
            return this;
        }
        public String getPackageStartDate() {
            return this.packageStartDate;
        }

        public DescribeSpacesResponseBodySpaces setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public DescribeSpacesResponseBodySpaces setRenewDuration(String renewDuration) {
            this.renewDuration = renewDuration;
            return this;
        }
        public String getRenewDuration() {
            return this.renewDuration;
        }

        public DescribeSpacesResponseBodySpaces setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeSpacesResponseBodySpaces setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public DescribeSpacesResponseBodySpaces setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

    }

}
