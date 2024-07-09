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

    /**
     * <p>The detailed information about resource plans. The returned information is displayed in an array of ResourcePackageInfo nodes.</p>
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
         * 
         * <strong>example:</strong>
         * <p>cdnflowbag</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The remaining quota of the resource plan.</p>
         * <ul>
         * <li>For a data transfer plan, the quota is measured in bytes.</li>
         * <li>For a request resource plan, the quota is measured in the number of requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10995089554629</p>
         */
        @NameInMap("CurrCapacity")
        public String currCapacity;

        /**
         * <p>The name of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>CDN data transfer plan (Chinese mainland)</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-01T08:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The total quota of the resource plan.</p>
         * <ul>
         * <li>For a data transfer plan, the quota is measured in bytes.</li>
         * <li>For a request resource plan, the quota is measured in the number of requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>536870912000</p>
         */
        @NameInMap("InitCapacity")
        public String initCapacity;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>FP-ilttxc23a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The effective time.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T19:10:58Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the resource plan. Valid values:</p>
         * <ul>
         * <li><strong>valid</strong>: valid</li>
         * <li><strong>closed</strong>: expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>CDN data transfer plan</p>
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
