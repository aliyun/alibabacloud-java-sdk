// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about each resource plan. The details are organized in an array. The array consists of the subparameter values of the ResourcePackageInfo parameter.</p>
     */
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
        /**
         * <p>The ID of the resource plan.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The remaining quota of the resource plan.</p>
         * <br>
         * <p>*   The total amount of data transfer provided by the resource plan. Unit: bytes.</p>
         * <p>*   The remaining number of requests provided by the resource plan.</p>
         */
        @NameInMap("CurrCapacity")
        public String currCapacity;

        /**
         * <p>The name of the resource plan.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the resource plan expires.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The total quota of the resource plan.</p>
         * <br>
         * <p>*   The total amount of data transfer provided by the resource plan. Unit: bytes.</p>
         * <p>*   The total number of requests provided by the resource plan.</p>
         */
        @NameInMap("InitCapacity")
        public String initCapacity;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the resource plan took effect.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the data transfer plan. Valid values:</p>
         * <br>
         * <p>*   **valid**: valid</p>
         * <p>*   **closed**: invalid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the template.</p>
         */
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

        public DescribeCdnUserResourcePackageResponseBodyResourcePackageInfosResourcePackageInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
