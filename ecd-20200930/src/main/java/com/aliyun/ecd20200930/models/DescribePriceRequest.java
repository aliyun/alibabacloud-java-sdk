// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The number of the resources. Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
     * <br>
     * <p>*   Valid values if the PayByTraffic parameter is set to PayByBandwidth: 10 to 1000</p>
     * <p>*   Valid values if the PayByTraffic parameter is set to PayByTraffic: 10 to 200</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BundleModels")
    public java.util.List<DescribePriceRequestBundleModels> bundleModels;

    @NameInMap("EduCdsSize")
    public Integer eduCdsSize;

    @NameInMap("EduCommittedTime")
    public Integer eduCommittedTime;

    @NameInMap("EduDesktopBundleId")
    public String eduDesktopBundleId;

    @NameInMap("EduDesktopNum")
    public Integer eduDesktopNum;

    @NameInMap("EduRoomClassify")
    public String eduRoomClassify;

    @NameInMap("EduStudentBundleId")
    public String eduStudentBundleId;

    @NameInMap("EduStudentNum")
    public Integer eduStudentNum;

    @NameInMap("EduTeacherBundleId")
    public String eduTeacherBundleId;

    @NameInMap("EduTeacherNum")
    public Integer eduTeacherNum;

    @NameInMap("GroupDesktopCount")
    public Integer groupDesktopCount;

    /**
     * <p>The model of the WUYING hardware client.</p>
     */
    @NameInMap("HardwareVersion")
    public String hardwareVersion;

    /**
     * <p>The resource specifications.</p>
     * <br>
     * <p>*   If you set ResourceType to Desktop, set this parameter to one of the following values:</p>
     * <br>
     * <p>    *   ecd.basic.small</p>
     * <p>    *   ecd.basic.large</p>
     * <p>    *   ecd.advanced.large</p>
     * <p>    *   ecd.advanced.xlarge</p>
     * <p>    *   ecd.performance.2xlarge</p>
     * <p>    *   ecd.graphics.xlarge</p>
     * <p>    *   ecd.graphics.2xlarge</p>
     * <p>    *   ecd.advanced.xlarge_s8d2</p>
     * <p>    *   ecd.advanced.xlarge_s8d7</p>
     * <p>    *   ecd.graphics.1g72c</p>
     * <p>    *   eds.general.2c2g</p>
     * <p>    *   eds.general.2c4g</p>
     * <p>    *   eds.general.2c8g</p>
     * <p>    *   eds.general.4c8g</p>
     * <p>    *   eds.general.4c16g</p>
     * <p>    *   eds.general.8c16g</p>
     * <p>    *   eds.general.8c32g</p>
     * <p>    *   eds.general.16c32g</p>
     * <br>
     * <p>*   If you set ResourceType to OfficeSite, set this parameter to large.</p>
     * <br>
     * <p>*   If you set ResourceType to Bandwidth, leave this parameter empty.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The metering method of the Internet access package. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic: pay-by-data-transfer</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The OS. Valid values:</p>
     * <br>
     * <p>*   Windows</p>
     * <p>*   Linux</p>
     * <br>
     * <p>Default value: Windows.</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("PackageSize")
    public Integer packageSize;

    /**
     * <p>The subscription duration. Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the billing cycle. Valid values:</p>
     * <br>
     * <p>*   Hour</p>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Hour.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   Desktop: cloud desktop</p>
     * <p>*   OfficeSite: workspace</p>
     * <p>*   Bandwidth: network bandwidth</p>
     * <br>
     * <p>Default value: Desktop.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The performance level (PL) of the system disk. Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The system disk size. Unit: GiB.</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    @NameInMap("SpPeriodInfo")
    public String spPeriodInfo;

    @NameInMap("SpPrice")
    public Boolean spPrice;

    @NameInMap("SpType")
    public String spType;

    /**
     * <p>The PL of the data disk. Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The data disk size. Unit: GiB.</p>
     */
    @NameInMap("UserDiskSizeGib")
    public Integer userDiskSizeGib;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribePriceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribePriceRequest setBundleModels(java.util.List<DescribePriceRequestBundleModels> bundleModels) {
        this.bundleModels = bundleModels;
        return this;
    }
    public java.util.List<DescribePriceRequestBundleModels> getBundleModels() {
        return this.bundleModels;
    }

    public DescribePriceRequest setEduCdsSize(Integer eduCdsSize) {
        this.eduCdsSize = eduCdsSize;
        return this;
    }
    public Integer getEduCdsSize() {
        return this.eduCdsSize;
    }

    public DescribePriceRequest setEduCommittedTime(Integer eduCommittedTime) {
        this.eduCommittedTime = eduCommittedTime;
        return this;
    }
    public Integer getEduCommittedTime() {
        return this.eduCommittedTime;
    }

    public DescribePriceRequest setEduDesktopBundleId(String eduDesktopBundleId) {
        this.eduDesktopBundleId = eduDesktopBundleId;
        return this;
    }
    public String getEduDesktopBundleId() {
        return this.eduDesktopBundleId;
    }

    public DescribePriceRequest setEduDesktopNum(Integer eduDesktopNum) {
        this.eduDesktopNum = eduDesktopNum;
        return this;
    }
    public Integer getEduDesktopNum() {
        return this.eduDesktopNum;
    }

    public DescribePriceRequest setEduRoomClassify(String eduRoomClassify) {
        this.eduRoomClassify = eduRoomClassify;
        return this;
    }
    public String getEduRoomClassify() {
        return this.eduRoomClassify;
    }

    public DescribePriceRequest setEduStudentBundleId(String eduStudentBundleId) {
        this.eduStudentBundleId = eduStudentBundleId;
        return this;
    }
    public String getEduStudentBundleId() {
        return this.eduStudentBundleId;
    }

    public DescribePriceRequest setEduStudentNum(Integer eduStudentNum) {
        this.eduStudentNum = eduStudentNum;
        return this;
    }
    public Integer getEduStudentNum() {
        return this.eduStudentNum;
    }

    public DescribePriceRequest setEduTeacherBundleId(String eduTeacherBundleId) {
        this.eduTeacherBundleId = eduTeacherBundleId;
        return this;
    }
    public String getEduTeacherBundleId() {
        return this.eduTeacherBundleId;
    }

    public DescribePriceRequest setEduTeacherNum(Integer eduTeacherNum) {
        this.eduTeacherNum = eduTeacherNum;
        return this;
    }
    public Integer getEduTeacherNum() {
        return this.eduTeacherNum;
    }

    public DescribePriceRequest setGroupDesktopCount(Integer groupDesktopCount) {
        this.groupDesktopCount = groupDesktopCount;
        return this;
    }
    public Integer getGroupDesktopCount() {
        return this.groupDesktopCount;
    }

    public DescribePriceRequest setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
        return this;
    }
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public DescribePriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribePriceRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribePriceRequest setPackageSize(Integer packageSize) {
        this.packageSize = packageSize;
        return this;
    }
    public Integer getPackageSize() {
        return this.packageSize;
    }

    public DescribePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribePriceRequest setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
        this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
        return this;
    }
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    public DescribePriceRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public DescribePriceRequest setSpPeriodInfo(String spPeriodInfo) {
        this.spPeriodInfo = spPeriodInfo;
        return this;
    }
    public String getSpPeriodInfo() {
        return this.spPeriodInfo;
    }

    public DescribePriceRequest setSpPrice(Boolean spPrice) {
        this.spPrice = spPrice;
        return this;
    }
    public Boolean getSpPrice() {
        return this.spPrice;
    }

    public DescribePriceRequest setSpType(String spType) {
        this.spType = spType;
        return this;
    }
    public String getSpType() {
        return this.spType;
    }

    public DescribePriceRequest setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
        this.userDiskPerformanceLevel = userDiskPerformanceLevel;
        return this;
    }
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    public DescribePriceRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static class DescribePriceRequestBundleModels extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("Duration")
        public Integer duration;

        public static DescribePriceRequestBundleModels build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestBundleModels self = new DescribePriceRequestBundleModels();
            return TeaModel.build(map, self);
        }

        public DescribePriceRequestBundleModels setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribePriceRequestBundleModels setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribePriceRequestBundleModels setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

    }

}
