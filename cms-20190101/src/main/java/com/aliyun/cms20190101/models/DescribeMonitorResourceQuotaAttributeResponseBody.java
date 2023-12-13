// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the resource quotas of CloudMonitor.</p>
     */
    @NameInMap("ResourceQuota")
    public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota resourceQuota;

    public static DescribeMonitorResourceQuotaAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorResourceQuotaAttributeResponseBody self = new DescribeMonitorResourceQuotaAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorResourceQuotaAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitorResourceQuotaAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorResourceQuotaAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorResourceQuotaAttributeResponseBody setResourceQuota(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota resourceQuota) {
        this.resourceQuota = resourceQuota;
        return this;
    }
    public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota getResourceQuota() {
        return this.resourceQuota;
    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi extends TeaModel {
        /**
         * <p>The total quota of API calls. Unit: 10,000 calls.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of API calls in your resource plan. Unit: 10,000 calls.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of API calls in your resource plan. Unit: calls.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor extends TeaModel {
        /**
         * <p>The total quota of the time series for custom monitoring.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of the time series for custom monitoring in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of the time series for custom monitoring in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota extends TeaModel {
        /**
         * <p>The ID of the instance monitored by Hybrid Cloud Monitoring.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The description of Hybrid Cloud Monitoring.</p>
         */
        @NameInMap("SuitInfo")
        public String suitInfo;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota setSuitInfo(String suitInfo) {
            this.suitInfo = suitInfo;
            return this;
        }
        public String getSuitInfo() {
            return this.suitInfo;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor extends TeaModel {
        /**
         * <p>The total quota of events that can be reported in event monitoring. The total quota is the value that is multiplied by 10,000.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of events that can be reported in event monitoring in your resource plan. The total quota is the value that is multiplied by 10,000.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor extends TeaModel {
        /**
         * <p>The total quota of processed log data in log monitoring. Unit: MB/min.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of processed log data in log monitoring in your resource plan. Unit: MB/min.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of processed log data in log monitoring in your resource plan. Unit: MB/min.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone extends TeaModel {
        /**
         * <p>The total quota of alert phone calls. Unit: calls.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of alert phone calls in your resource plan. Unit: calls.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of alert phone calls in your resource plan. Unit: calls.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS extends TeaModel {
        /**
         * <p>The total quota of alert text messages.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of alert text messages in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of alert text messages in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser extends TeaModel {
        /**
         * <p>The total quota of browser detection tasks.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of browser detection tasks in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of browser detection tasks in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe extends TeaModel {
        /**
         * <p>The total quota of ECS detection points for site monitoring.</p>
         * <br>
         * <p>> The value indicates the maximum number of ECS detection points that you can select for a site monitoring task.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of ECS detection points for site monitoring in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of ECS detection points for site monitoring in your resource plan.</p>
         * <br>
         * <p>> The value indicates the total number of ECS detection points that are used by existing site monitoring tasks.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile extends TeaModel {
        /**
         * <p>The total quota of mobile detection tasks.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of mobile detection tasks in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of mobile detection tasks in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe extends TeaModel {
        /**
         * <p>The total quota of carrier detection points for site monitoring.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of carrier detection points for site monitoring in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of carrier detection points for site monitoring in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask extends TeaModel {
        /**
         * <p>The total quota of site monitoring tasks.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of site monitoring tasks in your resource plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of site monitoring tasks in your resource plan.</p>
         */
        @NameInMap("QuotaUsed")
        public Integer quotaUsed;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask setQuotaLimit(Integer quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Integer getQuotaLimit() {
            return this.quotaLimit;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask setQuotaPackage(Integer quotaPackage) {
            this.quotaPackage = quotaPackage;
            return this;
        }
        public Integer getQuotaPackage() {
            return this.quotaPackage;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask setQuotaUsed(Integer quotaUsed) {
            this.quotaUsed = quotaUsed;
            return this;
        }
        public Integer getQuotaUsed() {
            return this.quotaUsed;
        }

    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota extends TeaModel {
        /**
         * <p>The details about the quota of API calls.</p>
         */
        @NameInMap("Api")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi api;

        /**
         * <p>The details about the quota for custom monitoring.</p>
         */
        @NameInMap("CustomMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor customMonitor;

        /**
         * <p>The details about the quota of Hybrid Cloud Monitoring.</p>
         */
        @NameInMap("EnterpriseQuota")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota enterpriseQuota;

        /**
         * <p>The details about the quota for event monitoring.</p>
         */
        @NameInMap("EventMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor eventMonitor;

        /**
         * <p>The time when the resource plan expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the resource plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The details about the quota for log monitoring.</p>
         */
        @NameInMap("LogMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor logMonitor;

        /**
         * <p>The details about the quota of alert phone calls.</p>
         */
        @NameInMap("Phone")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone phone;

        /**
         * <p>The details about the quota of alert text messages.</p>
         */
        @NameInMap("SMS")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS SMS;

        /**
         * <p>The quota of browser detection tasks.</p>
         */
        @NameInMap("SiteMonitorBrowser")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser siteMonitorBrowser;

        /**
         * <p>The details about the quota of ECS detection points for site monitoring.</p>
         */
        @NameInMap("SiteMonitorEcsProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe;

        /**
         * <p>The quota of mobile detection tasks.</p>
         */
        @NameInMap("SiteMonitorMobile")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile siteMonitorMobile;

        /**
         * <p>The details about the quota of carrier detection points for site monitoring.</p>
         */
        @NameInMap("SiteMonitorOperatorProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe siteMonitorOperatorProbe;

        /**
         * <p>The quota of site monitoring tasks.</p>
         */
        @NameInMap("SiteMonitorTask")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask siteMonitorTask;

        /**
         * <p>The current edition of CloudMonitor. Valid values:</p>
         * <br>
         * <p>*   free: Free Edition</p>
         * <p>*   pro: Pro Edition</p>
         * <p>*   cms_post: pay-as-you-go</p>
         */
        @NameInMap("SuitInfo")
        public String suitInfo;

        public static DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota self = new DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setApi(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi api) {
            this.api = api;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi getApi() {
            return this.api;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setCustomMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor customMonitor) {
            this.customMonitor = customMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor getCustomMonitor() {
            return this.customMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setEnterpriseQuota(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota enterpriseQuota) {
            this.enterpriseQuota = enterpriseQuota;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota getEnterpriseQuota() {
            return this.enterpriseQuota;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setEventMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor eventMonitor) {
            this.eventMonitor = eventMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor getEventMonitor() {
            return this.eventMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setLogMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor logMonitor) {
            this.logMonitor = logMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor getLogMonitor() {
            return this.logMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setPhone(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone phone) {
            this.phone = phone;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone getPhone() {
            return this.phone;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSMS(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS SMS) {
            this.SMS = SMS;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS getSMS() {
            return this.SMS;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorBrowser(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser siteMonitorBrowser) {
            this.siteMonitorBrowser = siteMonitorBrowser;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorBrowser getSiteMonitorBrowser() {
            return this.siteMonitorBrowser;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorEcsProbe(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe) {
            this.siteMonitorEcsProbe = siteMonitorEcsProbe;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe getSiteMonitorEcsProbe() {
            return this.siteMonitorEcsProbe;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorMobile(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile siteMonitorMobile) {
            this.siteMonitorMobile = siteMonitorMobile;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorMobile getSiteMonitorMobile() {
            return this.siteMonitorMobile;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorOperatorProbe(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe siteMonitorOperatorProbe) {
            this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe getSiteMonitorOperatorProbe() {
            return this.siteMonitorOperatorProbe;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorTask(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask siteMonitorTask) {
            this.siteMonitorTask = siteMonitorTask;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask getSiteMonitorTask() {
            return this.siteMonitorTask;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSuitInfo(String suitInfo) {
            this.suitInfo = suitInfo;
            return this;
        }
        public String getSuitInfo() {
            return this.suitInfo;
        }

    }

}
