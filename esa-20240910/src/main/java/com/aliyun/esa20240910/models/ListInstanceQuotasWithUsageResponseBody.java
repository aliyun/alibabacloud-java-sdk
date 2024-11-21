// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasWithUsageResponseBody extends TeaModel {
    /**
     * <p>The plan ID.<a href="~~2850189~~"></a></p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quotas and their actual usage in the plan.</p>
     */
    @NameInMap("Quotas")
    public java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotas> quotas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The plan status. Valid values:</p>
     * <ul>
     * <li>online: The plan is in service.</li>
     * <li>offline: The plan has expired within an allowable period. In this state, the plan is unavailable.</li>
     * <li>disable: The plan is released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstanceQuotasWithUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasWithUsageResponseBody self = new ListInstanceQuotasWithUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasWithUsageResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasWithUsageResponseBody setQuotas(java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListInstanceQuotasWithUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceQuotasWithUsageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage extends TeaModel {
        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34818329392****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.top</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The quota usage of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteUsage")
        public String siteUsage;

        public static ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage self = new ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage();
            return TeaModel.build(map, self);
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage setSiteUsage(String siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }
        public String getSiteUsage() {
            return this.siteUsage;
        }

    }

    public static class ListInstanceQuotasWithUsageResponseBodyQuotas extends TeaModel {
        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>redirect_rules|rule_quota</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QuotaValue")
        public String quotaValue;

        /**
         * <p>The usage of the quota in each website associated with the plan.</p>
         */
        @NameInMap("SiteUsage")
        public java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage> siteUsage;

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static ListInstanceQuotasWithUsageResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceQuotasWithUsageResponseBodyQuotas self = new ListInstanceQuotasWithUsageResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotas setQuotaValue(String quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public String getQuotaValue() {
            return this.quotaValue;
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotas setSiteUsage(java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage> siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }
        public java.util.List<ListInstanceQuotasWithUsageResponseBodyQuotasSiteUsage> getSiteUsage() {
            return this.siteUsage;
        }

        public ListInstanceQuotasWithUsageResponseBodyQuotas setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
