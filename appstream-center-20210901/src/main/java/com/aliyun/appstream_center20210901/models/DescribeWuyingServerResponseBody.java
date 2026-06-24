// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeWuyingServerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerResponseBody self = new DescribeWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerResponseBody setData(DescribeWuyingServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWuyingServerResponseBodyData getData() {
        return this.data;
    }

    public DescribeWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWuyingServerResponseBodyDataPrivateIpSets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeWuyingServerResponseBodyDataPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyDataPrivateIpSets self = new DescribeWuyingServerResponseBodyDataPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyDataPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeWuyingServerResponseBodyDataPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeWuyingServerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EniPrivateIpAddressQuantity")
        public Integer eniPrivateIpAddressQuantity;

        /**
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>img-bp1234567890abcde</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>Ubuntu 22.04</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-abc123</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>默认工作区</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        @NameInMap("PrivateIpSets")
        public java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> privateIpSets;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <strong>example:</strong>
         * <p>aig-bp1234567890abcde</p>
         */
        @NameInMap("WuyingServerId")
        public String wuyingServerId;

        /**
         * <strong>example:</strong>
         * <p>my-dev-server</p>
         */
        @NameInMap("WuyingServerName")
        public String wuyingServerName;

        public static DescribeWuyingServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerResponseBodyData self = new DescribeWuyingServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerResponseBodyData setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeWuyingServerResponseBodyData setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public DescribeWuyingServerResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeWuyingServerResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeWuyingServerResponseBodyData setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }
        public Integer getEniPrivateIpAddressQuantity() {
            return this.eniPrivateIpAddressQuantity;
        }

        public DescribeWuyingServerResponseBodyData setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeWuyingServerResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeWuyingServerResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeWuyingServerResponseBodyData setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeWuyingServerResponseBodyData setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeWuyingServerResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeWuyingServerResponseBodyData setPrivateIpSets(java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public java.util.List<DescribeWuyingServerResponseBodyDataPrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

        public DescribeWuyingServerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWuyingServerResponseBodyData setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeWuyingServerResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeWuyingServerResponseBodyData setWuyingServerId(String wuyingServerId) {
            this.wuyingServerId = wuyingServerId;
            return this;
        }
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        public DescribeWuyingServerResponseBodyData setWuyingServerName(String wuyingServerName) {
            this.wuyingServerName = wuyingServerName;
            return this;
        }
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

    }

}
