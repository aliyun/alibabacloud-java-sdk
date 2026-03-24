// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>84839536-2B7E-457D-9D8C-82E6C7D4E1A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePackageInfos")
    public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos resourcePackageInfos;

    public static DescribeCdnUserResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserResourcePackageResponseBody self = new DescribeCdnUserResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserResourcePackageResponseBody setResourcePackageInfos(DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos resourcePackageInfos) {
        this.resourcePackageInfos = resourcePackageInfos;
        return this;
    }
    public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos getResourcePackageInfos() {
        return this.resourcePackageInfos;
    }

    public static class DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CurrCapacity")
        public String currCapacity;

        @NameInMap("CurrCapacityBaseUnit")
        public String currCapacityBaseUnit;

        @NameInMap("CurrCapacityShowUnit")
        public String currCapacityShowUnit;

        @NameInMap("CurrCapacityShowValue")
        public String currCapacityShowValue;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InitCapacity")
        public String initCapacity;

        @NameInMap("InitCapacityBaseUnit")
        public String initCapacityBaseUnit;

        @NameInMap("InitCapacityShowUnit")
        public String initCapacityShowUnit;

        @NameInMap("InitCapacityShowValue")
        public String initCapacityShowValue;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo self = new DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCurrCapacity(String currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public String getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCurrCapacityBaseUnit(String currCapacityBaseUnit) {
            this.currCapacityBaseUnit = currCapacityBaseUnit;
            return this;
        }
        public String getCurrCapacityBaseUnit() {
            return this.currCapacityBaseUnit;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCurrCapacityShowUnit(String currCapacityShowUnit) {
            this.currCapacityShowUnit = currCapacityShowUnit;
            return this;
        }
        public String getCurrCapacityShowUnit() {
            return this.currCapacityShowUnit;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCurrCapacityShowValue(String currCapacityShowValue) {
            this.currCapacityShowValue = currCapacityShowValue;
            return this;
        }
        public String getCurrCapacityShowValue() {
            return this.currCapacityShowValue;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInitCapacity(String initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public String getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInitCapacityBaseUnit(String initCapacityBaseUnit) {
            this.initCapacityBaseUnit = initCapacityBaseUnit;
            return this;
        }
        public String getInitCapacityBaseUnit() {
            return this.initCapacityBaseUnit;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInitCapacityShowUnit(String initCapacityShowUnit) {
            this.initCapacityShowUnit = initCapacityShowUnit;
            return this;
        }
        public String getInitCapacityShowUnit() {
            return this.initCapacityShowUnit;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInitCapacityShowValue(String initCapacityShowValue) {
            this.initCapacityShowValue = initCapacityShowValue;
            return this;
        }
        public String getInitCapacityShowValue() {
            return this.initCapacityShowValue;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos extends TeaModel {
        @NameInMap("ResourcePackageInfo")
        public java.util.List<DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> resourcePackageInfo;

        public static DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos self = new DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfos setResourcePackageInfo(java.util.List<DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> resourcePackageInfo) {
            this.resourcePackageInfo = resourcePackageInfo;
            return this;
        }
        public java.util.List<DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> getResourcePackageInfo() {
            return this.resourcePackageInfo;
        }

    }

}
