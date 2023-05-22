// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about resource plans. The returned information is displayed in the format that is specified by the ResourcePackageInfo parameter.</p>
     */
    @NameInMap("ResourcePackageInfos")
    public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos resourcePackageInfos;

    public static DescribeDcdnUserResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserResourcePackageResponseBody self = new DescribeDcdnUserResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserResourcePackageResponseBody setResourcePackageInfos(DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos resourcePackageInfos) {
        this.resourcePackageInfos = resourcePackageInfos;
        return this;
    }
    public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos getResourcePackageInfos() {
        return this.resourcePackageInfos;
    }

    public static class DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo extends TeaModel {
        /**
         * <p>The commodity code of the resource plan.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The remaining quota of the resource plan.</p>
         * <br>
         * <p>*   The unit for traffic: bytes.</p>
         * <p>*   The unit for requests: count.</p>
         */
        @NameInMap("CurrCapacity")
        public String currCapacity;

        /**
         * <p>The name of the resource plan.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The expiration time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The total quota of the resource plan.</p>
         * <br>
         * <p>*   The unit for traffic: bytes.</p>
         * <p>*   The unit for requests: count.</p>
         */
        @NameInMap("InitCapacity")
        public String initCapacity;

        /**
         * <p>The ID of the resource plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The validation time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the resource plan. Valid values:</p>
         * <br>
         * <p>*   **valid**: valid</p>
         * <p>*   **closed**: expired</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo self = new DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setCurrCapacity(String currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public String getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInitCapacity(String initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public String getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos extends TeaModel {
        @NameInMap("ResourcePackageInfo")
        public java.util.List<DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> resourcePackageInfo;

        public static DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos self = new DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfos setResourcePackageInfo(java.util.List<DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> resourcePackageInfo) {
            this.resourcePackageInfo = resourcePackageInfo;
            return this;
        }
        public java.util.List<DescribeDcdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo> getResourcePackageInfo() {
            return this.resourcePackageInfo;
        }

    }

}
