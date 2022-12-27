// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserResourcePackageResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details about each resource plan. The details are organized in an array. The array consists of the subparameter values of the ResourcePackageInfo parameter.
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
        // The ID of the resource plan.
        @NameInMap("CommodityCode")
        public String commodityCode;

        // The remaining quota of the resource plan.
        // 
        // *   The total amount of data transfer provided by the resource plan. Unit: bytes.
        // *   The remaining number of requests provided by the resource plan.
        @NameInMap("CurrCapacity")
        public String currCapacity;

        // The name of the resource plan.
        @NameInMap("DisplayName")
        public String displayName;

        // The time when the resource plan expires.
        @NameInMap("EndTime")
        public String endTime;

        // The total quota of the resource plan.
        // 
        // *   The total amount of data transfer provided by the resource plan. Unit: bytes.
        // *   The total number of requests provided by the resource plan.
        @NameInMap("InitCapacity")
        public String initCapacity;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The time when the resource plan took effect.
        @NameInMap("StartTime")
        public String startTime;

        // The status of the data transfer plan. Valid values:
        // 
        // *   **valid**: valid
        // *   **closed**: invalid
        @NameInMap("Status")
        public String status;

        // The name of the template.
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
