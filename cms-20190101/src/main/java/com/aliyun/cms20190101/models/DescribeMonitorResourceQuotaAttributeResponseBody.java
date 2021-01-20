// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceQuota")
    public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota resourceQuota;

    @NameInMap("Code")
    public String code;

    public static DescribeMonitorResourceQuotaAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorResourceQuotaAttributeResponseBody self = new DescribeMonitorResourceQuotaAttributeResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeMonitorResourceQuotaAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe extends TeaModel {
        @NameInMap("QuotaLimit")
        public Integer quotaLimit;

        @NameInMap("QuotaPackage")
        public Integer quotaPackage;

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

    public static class DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota extends TeaModel {
        @NameInMap("Api")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaApi api;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CustomMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor customMonitor;

        @NameInMap("EventMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor eventMonitor;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SiteMonitorTask")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask siteMonitorTask;

        @NameInMap("Phone")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone phone;

        @NameInMap("SuitInfo")
        public String suitInfo;

        @NameInMap("SMS")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS SMS;

        @NameInMap("LogMonitor")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor logMonitor;

        @NameInMap("SiteMonitorOperatorProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe siteMonitorOperatorProbe;

        @NameInMap("SiteMonitorEcsProbe")
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe;

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

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setCustomMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor customMonitor) {
            this.customMonitor = customMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaCustomMonitor getCustomMonitor() {
            return this.customMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setEventMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor eventMonitor) {
            this.eventMonitor = eventMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaEventMonitor getEventMonitor() {
            return this.eventMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorTask(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask siteMonitorTask) {
            this.siteMonitorTask = siteMonitorTask;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorTask getSiteMonitorTask() {
            return this.siteMonitorTask;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setPhone(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone phone) {
            this.phone = phone;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaPhone getPhone() {
            return this.phone;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSuitInfo(String suitInfo) {
            this.suitInfo = suitInfo;
            return this;
        }
        public String getSuitInfo() {
            return this.suitInfo;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSMS(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS SMS) {
            this.SMS = SMS;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSMS getSMS() {
            return this.SMS;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setLogMonitor(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor logMonitor) {
            this.logMonitor = logMonitor;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaLogMonitor getLogMonitor() {
            return this.logMonitor;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorOperatorProbe(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe siteMonitorOperatorProbe) {
            this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorOperatorProbe getSiteMonitorOperatorProbe() {
            return this.siteMonitorOperatorProbe;
        }

        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuota setSiteMonitorEcsProbe(DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe siteMonitorEcsProbe) {
            this.siteMonitorEcsProbe = siteMonitorEcsProbe;
            return this;
        }
        public DescribeMonitorResourceQuotaAttributeResponseBodyResourceQuotaSiteMonitorEcsProbe getSiteMonitorEcsProbe() {
            return this.siteMonitorEcsProbe;
        }

    }

}
