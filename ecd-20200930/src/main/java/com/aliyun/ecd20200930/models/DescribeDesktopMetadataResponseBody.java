// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopMetadataResponseBody extends TeaModel {
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopMetadataResponseBodyDesktops> desktops;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopMetadataResponseBody self = new DescribeDesktopMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopMetadataResponseBody setDesktops(java.util.List<DescribeDesktopMetadataResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopMetadataResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeDesktopMetadataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopMetadataResponseBodyDesktops extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-f3s3dgt8dtb0vlqc8</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>serverless_new</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>2020-11-06T08:31Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDesktopMetadataResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopMetadataResponseBodyDesktops self = new DescribeDesktopMetadataResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopMetadataResponseBodyDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeDesktopMetadataResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
