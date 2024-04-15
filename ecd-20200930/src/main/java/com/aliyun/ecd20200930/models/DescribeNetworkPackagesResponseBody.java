// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesResponseBody extends TeaModel {
    /**
     * <p>The premium bandwidth plans.</p>
     */
    @NameInMap("NetworkPackages")
    public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> networkPackages;

    /**
     * <p>The token that is used to start the next query. If the value of this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
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

    public static class DescribeNetworkPackagesResponseBodyNetworkPackages extends TeaModel {
        /**
         * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The business status.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Expired</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Normal</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the premium bandwidth plan was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The public egress IP address of the premium bandwidth plan.</p>
         */
        @NameInMap("EipAddresses")
        public java.util.List<String> eipAddresses;

        /**
         * <p>The time when the premium bandwidth plan expires.</p>
         * <br>
         * <p>*   If the plan is a subscription one, the time when the plan expires is returned.</p>
         * <p>*   If the plan is a pay-as-you-go one, `2099-12-31T15:59:59Z` is returned.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The charge type of the premium bandwidth plan.</p>
         * <br>
         * <p>*   Valid value when the `PayType` parameter is set to `PrePaid`:</p>
         * <br>
         * <p>    *   PayByBandwidth: charges by fixed bandwidth.</p>
         * <br>
         * <p>*   Valid values when the `PayType` parameter is set to `PostPaid`:</p>
         * <br>
         * <p>    *   PayByTraffic: charges by data transfer.</p>
         * <p>    *   PayByBandwidth: charges by fixed bandwidth.</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The ID of the premium bandwidth plan.</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <p>The status of the premium bandwidth plan.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Released</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   InUse</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Releasing</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("NetworkPackageStatus")
        public String networkPackageStatus;

        /**
         * <p>The office network ID.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The type of the office network.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   standard: advanced office network</p>
         * <p>*   customized: custom office network</p>
         * <p>*   basic: basic office network</p>
         */
        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        /**
         * <p>The billing method of the premium bandwidth plan.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PostPaid: pay-as-you-go</p>
         * <p>*   PrePaid: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The time when the reserved network bandwidth took effect.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The peak bandwidth that is reserved for the premium bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("ReservationBandwidth")
        public Integer reservationBandwidth;

        /**
         * <p>The billing method of the reserved network bandwidth.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PayByTraffic: charges by data transfer.</p>
         * <br>
         * <p>*   PayByBandwidth: charges by fixed bandwidth.</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

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

    }

}
