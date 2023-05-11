// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeResponseBody extends TeaModel {
    /**
     * <p>The quota of alert phone calls in your purchased resource plan. Unit: calls.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The used quota of the time series in custom monitoring in your purchased plan.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details about the quota of detection points that are provided by other carriers in site monitoring.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total quota of alert text messages.</p>
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
         * <p>The current edition of CloudMonitor. Valid values:</p>
         * <br>
         * <p>*   free: free edition</p>
         * <p>*   pro: Professional Edition</p>
         * <p>*   cms_post: pay-as-you-go</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The used quota of API operation calls in your purchased plan. Unit: calls.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The quota of alert text messages in your purchased resource plan.</p>
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
         * <p>The total quota of alert phone calls. Unit: calls.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of site monitoring tasks.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The total quota of events that can be reported in event monitoring. The total quota is the value that is multiplied by 10,000.</p>
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
        @NameInMap("InstanceId")
        public String instanceId;

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
         * <p>The used quota of detection points that are provided by Alibaba Cloud in site monitoring in your purchased plan.</p>
         * <br>
         * <p>>  The value indicates the total number of detection points provided by Alibaba Cloud that are used by existing site monitoring tasks.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The details about the quota of custom monitoring.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The description of the instance.</p>
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
         * <p>The used quota of events that can be reported in event monitoring in your purchased plan. The product of multiplying the value and 10,000 indicates the used quota.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The details about the resource quotas of CloudMonitor.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The used quota of alert text messages in your purchased resource plan.</p>
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
         * <p>The quota of processed log data in log monitoring in your purchased plan. Unit: MB/min.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The quota of API operation calls in your purchased plan. Unit: 10,000 calls.</p>
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
         * <p>The details about the quota of detection points that are provided by Alibaba Cloud in site monitoring.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The used quota of processed log data in log monitoring in your purchased plan. Unit: MB/min.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The quota of events that can be reported in event monitoring in your purchased plan. The quota of events that can be reported in event monitoring.</p>
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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe extends TeaModel {
        /**
         * <p>The used quota of site monitoring tasks in your purchased plan.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The quota of the time series in custom monitoring in your purchased plan.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>Specifies whether to return information about used quotas. Valid values:</p>
         * <br>
         * <p>*   true: to include information about used quotas. Default value: true.</p>
         * <p>*   false: to exclude information about used quotas.</p>
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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe extends TeaModel {
        /**
         * <p>The total quota of processed log data in log monitoring. Unit: MB/min.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The time when the plan expires.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The details about the quota of event monitoring.</p>
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
         * <p>The total quota of the time series in custom monitoring.</p>
         */
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        /**
         * <p>The details about the quota.</p>
         */
        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

        /**
         * <p>The ID of the purchased subscription plan.</p>
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
         * <p>The details about the quota of API operation calls.</p>
         */
        @NameInMap("Api")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi api;

        /**
         * <p>The quota of detection points that are provided by other carriers in site monitoring in your purchased plan.</p>
         */
        @NameInMap("CustomMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor customMonitor;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("EnterpriseQuota")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEnterpriseQuota enterpriseQuota;

        /**
         * <p>The details about the quota of alert phone calls.</p>
         */
        @NameInMap("EventMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor eventMonitor;

        /**
         * <p>The total quota of detection points that are provided by Alibaba Cloud in site monitoring.</p>
         * <br>
         * <p>>  The value indicates the maximum number of detection points provided by Alibaba Cloud that you can select for a site monitoring task.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The operation that you want to perform. Set the value to DescribeMonitorResourceQuotaAttribute.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The total quota of site monitoring tasks.</p>
         */
        @NameInMap("LogMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor logMonitor;

        /**
         * <p>The details about the quota of alert text messages.</p>
         */
        @NameInMap("Phone")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone phone;

        /**
         * <p>The used quota of detection points that are provided by other carriers in site monitoring in your purchased plan.</p>
         */
        @NameInMap("SMS")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS SMS;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("SiteMonitorEcsProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe;

        /**
         * <p>The total quota of API operation calls. Unit: 10,000 calls.</p>
         */
        @NameInMap("SiteMonitorOperatorProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe siteMonitorOperatorProbe;

        /**
         * <p>The quota of site monitoring tasks in your purchased plan.</p>
         */
        @NameInMap("SiteMonitorTask")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask siteMonitorTask;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The HTTP status code 200 indicates that the call succeeds.</p>
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

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorEcsProbe(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe) {
            this.siteMonitorEcsProbe = siteMonitorEcsProbe;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe getSiteMonitorEcsProbe() {
            return this.siteMonitorEcsProbe;
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
