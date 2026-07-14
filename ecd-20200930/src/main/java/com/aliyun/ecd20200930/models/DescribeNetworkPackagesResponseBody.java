// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesResponseBody extends TeaModel {
    /**
     * <p>The list of premium Internet bandwidth plans.</p>
     */
    @NameInMap("NetworkPackages")
    public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> networkPackages;

    /**
     * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesResponseBody self = new DescribeNetworkPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesResponseBody setNetworkPackages(java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> networkPackages) {
        this.networkPackages = networkPackages;
        return this;
    }
    public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> getNetworkPackages() {
        return this.networkPackages;
    }

    public DescribeNetworkPackagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkPackagesResponseBodyNetworkPackagesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNetworkPackagesResponseBodyNetworkPackagesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPackagesResponseBodyNetworkPackagesTags self = new DescribeNetworkPackagesResponseBodyNetworkPackagesTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackagesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackagesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNetworkPackagesResponseBodyNetworkPackages extends TeaModel {
        /**
         * <p>The bandwidth of the premium Internet bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The business status.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-10T02:35:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The public egress IP address of the premium Internet bandwidth plan.</p>
         */
        @NameInMap("EipAddresses")
        public java.util.List<String> eipAddresses;

        /**
         * <p>The expiration time of the premium Internet bandwidth plan.</p>
         * <ul>
         * <li>If the plan uses the subscription billing method, the actual expiration time is returned.</li>
         * <li>If the plan uses the pay-as-you-go billing method, <code>2099-12-31T15:59:59Z</code> is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T15:59:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The billing method of the premium Internet bandwidth plan.</p>
         * <ul>
         * <li>If the parameter <code>PayType</code> is set to <code>PrePaid</code>, valid values:<ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * </ul>
         * </li>
         * <li>If the parameter <code>PayType</code> is set to <code>PostPaid</code>, valid values:<ul>
         * <li>PayByTraffic: pay-by-data-transfer.</li>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The ID of the premium Internet bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>np-amtp8e8q1o9e4****</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <p>The status of the premium Internet bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("NetworkPackageStatus")
        public String networkPackageStatus;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The office network type.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The effective period of the reserved network bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10T00:00:00Z</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The peak reserved network bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ReservationBandwidth")
        public Integer reservationBandwidth;

        /**
         * <p>The billing method of the reserved network bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("Tags")
        public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackagesTags> tags;

        public static DescribeNetworkPackagesResponseBodyNetworkPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPackagesResponseBodyNetworkPackages self = new DescribeNetworkPackagesResponseBodyNetworkPackages();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setEipAddresses(java.util.List<String> eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }
        public java.util.List<String> getEipAddresses() {
            return this.eipAddresses;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setNetworkPackageStatus(String networkPackageStatus) {
            this.networkPackageStatus = networkPackageStatus;
            return this;
        }
        public String getNetworkPackageStatus() {
            return this.networkPackageStatus;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteVpcType(String officeSiteVpcType) {
            this.officeSiteVpcType = officeSiteVpcType;
            return this;
        }
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setReservationBandwidth(Integer reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public Integer getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setTags(java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackagesTags> getTags() {
            return this.tags;
        }

    }

}
