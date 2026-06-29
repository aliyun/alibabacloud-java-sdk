// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesResponseBody extends TeaModel {
    /**
     * <p>The plan instances that match the specified conditions under the user.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListUserRatePlanInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserRatePlanInstancesResponseBody self = new ListUserRatePlanInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserRatePlanInstancesResponseBody setInstanceInfo(java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListUserRatePlanInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRatePlanInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserRatePlanInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserRatePlanInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserRatePlanInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListUserRatePlanInstancesResponseBodyInstanceInfoSites extends TeaModel {
        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The site status. Valid values:</p>
         * <ul>
         * <li><strong>pending</strong>: The site is pending configuration.</li>
         * <li><strong>active</strong>: The site is activated.</li>
         * <li><strong>offline</strong>: The site is offline.</li>
         * <li><strong>moved</strong>: The site has been superseded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("SiteStatus")
        public String siteStatus;

        public static ListUserRatePlanInstancesResponseBodyInstanceInfoSites build(java.util.Map<String, ?> map) throws Exception {
            ListUserRatePlanInstancesResponseBodyInstanceInfoSites self = new ListUserRatePlanInstancesResponseBodyInstanceInfoSites();
            return TeaModel.build(map, self);
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfoSites setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfoSites setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfoSites setSiteStatus(String siteStatus) {
            this.siteStatus = siteStatus;
            return this;
        }
        public String getSiteStatus() {
            return this.siteStatus;
        }

    }

    public static class ListUserRatePlanInstancesResponseBodyInstanceInfo extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <p>If this field is empty, the plan does not include a bot protection instance. If a value is returned, the plan includes a bot protection instance. Valid values:</p>
         * <ul>
         * <li><p>enterprise_bot: Web Edition</p>
         * </li>
         * <li><p>enterprise_bot_with_app: App Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise_bot</p>
         */
        @NameInMap("BotInstanceLevel")
        public String botInstanceLevel;

        /**
         * <p>The prepaid bot protection requests included in the plan, in units of 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BotRequest")
        public String botRequest;

        /**
         * <p>The acceleration regions to which sites can be bound under this plan instance. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: China or the Chinese mainland.</li>
         * <li><strong>overseas</strong>: Global (excluding China or the Chinese mainland).</li>
         * <li><strong>global</strong>: Global (including China or the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic,overseas</p>
         */
        @NameInMap("Coverages")
        public String coverages;

        /**
         * <p>The purchase time of the plan instance. The time is in ISO 8601 format and displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The prepaid China network acceleration traffic included in the plan, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CrossborderTraffic")
        public String crossborderTraffic;

        /**
         * <p>The Anti-DDoS instance specification for the Chinese mainland included in the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_300</p>
         */
        @NameInMap("DdosBurstableDomesticProtection")
        public String ddosBurstableDomesticProtection;

        /**
         * <p>The Anti-DDoS instance specification outside the Chinese mainland included in the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>overseas_300</p>
         */
        @NameInMap("DdosBurstableOverseasProtection")
        public String ddosBurstableOverseasProtection;

        /**
         * <p>If this field is empty, the plan does not include an Anti-DDoS instance. If a value is returned, the plan includes an Anti-DDoS instance. The value is <code>esa_ddos_instance</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>esa_ddos_instance</p>
         */
        @NameInMap("DdosInstanceLevel")
        public String ddosInstanceLevel;

        /**
         * <p>The subscription duration of the plan instance. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The prepaid Edge Routine (ER) requests included in the plan, in units of 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EdgeRoutineRquest")
        public String edgeRoutineRquest;

        /**
         * <p>The prepaid WAF requests included in the plan, in units of 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EdgeWafRequest")
        public String edgeWafRequest;

        /**
         * <p>The expiration time of the plan instance. The time is in ISO 8601 format and displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The plan instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The prepaid Layer 4 proxy traffic included in the plan, in GB, for the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Layer4Traffic")
        public String layer4Traffic;

        /**
         * <p>The prepaid Layer 4 proxy traffic included in the plan, in GB, outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Layer4TrafficIntl")
        public String layer4TrafficIntl;

        /**
         * <p>The plan name associated with the plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The prepaid Layer 7 acceleration traffic included in the plan, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PlanTraffic")
        public String planTraffic;

        /**
         * <p>The plan type associated with the plan instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: fixed-version plan.</li>
         * <li><strong>enterprise</strong>: Enterprise Edition plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The auto-renewal cycle. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("RenewalDuration")
        public Long renewalDuration;

        /**
         * <p>The auto-renewal status. Valid values:</p>
         * <ul>
         * <li>nomal: normal</li>
         * <li>auto_renewal: auto-renewal enabled</li>
         * <li>not_renewal: auto-renewal disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nomal</p>
         */
        @NameInMap("RenewalStatus")
        public String renewalStatus;

        /**
         * <p>The site quota for the plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        /**
         * <p>The list of sites bound to the current plan instance.</p>
         */
        @NameInMap("Sites")
        public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        /**
         * <p>The prepaid smart routing requests included in the plan, in units of 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SmartRoutingRequest")
        public String smartRoutingRequest;

        /**
         * <p>The prepaid HTTP requests included in the plan, in units of 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StaticRequest")
        public String staticRequest;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The plan instance is in normal service.</li>
         * <li><strong>offline</strong>: The plan instance has expired but has not exceeded the grace period and is not active.</li>
         * <li><strong>disable</strong>: The plan instance has been released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The plan subscription type. Valid values:</p>
         * <ul>
         * <li>entranceplan: Free Edition (Chinese mainland)</li>
         * <li>entranceplan_intl: Free Edition (International)</li>
         * <li>basicplan: Basic Edition</li>
         * <li>standardplan: Standard Edition</li>
         * <li>advancedplan: Premium Edition</li>
         * <li>enterpriseplan: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basicplan</p>
         */
        @NameInMap("SubscribeType")
        public String subscribeType;

        public static ListUserRatePlanInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserRatePlanInstancesResponseBodyInstanceInfo self = new ListUserRatePlanInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setBotInstanceLevel(String botInstanceLevel) {
            this.botInstanceLevel = botInstanceLevel;
            return this;
        }
        public String getBotInstanceLevel() {
            return this.botInstanceLevel;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setBotRequest(String botRequest) {
            this.botRequest = botRequest;
            return this;
        }
        public String getBotRequest() {
            return this.botRequest;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setCoverages(String coverages) {
            this.coverages = coverages;
            return this;
        }
        public String getCoverages() {
            return this.coverages;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setCrossborderTraffic(String crossborderTraffic) {
            this.crossborderTraffic = crossborderTraffic;
            return this;
        }
        public String getCrossborderTraffic() {
            return this.crossborderTraffic;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setDdosBurstableDomesticProtection(String ddosBurstableDomesticProtection) {
            this.ddosBurstableDomesticProtection = ddosBurstableDomesticProtection;
            return this;
        }
        public String getDdosBurstableDomesticProtection() {
            return this.ddosBurstableDomesticProtection;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setDdosBurstableOverseasProtection(String ddosBurstableOverseasProtection) {
            this.ddosBurstableOverseasProtection = ddosBurstableOverseasProtection;
            return this;
        }
        public String getDdosBurstableOverseasProtection() {
            return this.ddosBurstableOverseasProtection;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setDdosInstanceLevel(String ddosInstanceLevel) {
            this.ddosInstanceLevel = ddosInstanceLevel;
            return this;
        }
        public String getDdosInstanceLevel() {
            return this.ddosInstanceLevel;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setEdgeRoutineRquest(String edgeRoutineRquest) {
            this.edgeRoutineRquest = edgeRoutineRquest;
            return this;
        }
        public String getEdgeRoutineRquest() {
            return this.edgeRoutineRquest;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setEdgeWafRequest(String edgeWafRequest) {
            this.edgeWafRequest = edgeWafRequest;
            return this;
        }
        public String getEdgeWafRequest() {
            return this.edgeWafRequest;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setLayer4Traffic(String layer4Traffic) {
            this.layer4Traffic = layer4Traffic;
            return this;
        }
        public String getLayer4Traffic() {
            return this.layer4Traffic;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setLayer4TrafficIntl(String layer4TrafficIntl) {
            this.layer4TrafficIntl = layer4TrafficIntl;
            return this;
        }
        public String getLayer4TrafficIntl() {
            return this.layer4TrafficIntl;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setPlanTraffic(String planTraffic) {
            this.planTraffic = planTraffic;
            return this;
        }
        public String getPlanTraffic() {
            return this.planTraffic;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setRenewalDuration(Long renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }
        public Long getRenewalDuration() {
            return this.renewalDuration;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setSiteQuota(String siteQuota) {
            this.siteQuota = siteQuota;
            return this;
        }
        public String getSiteQuota() {
            return this.siteQuota;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setSites(java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfoSites> sites) {
            this.sites = sites;
            return this;
        }
        public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfoSites> getSites() {
            return this.sites;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setSmartRoutingRequest(String smartRoutingRequest) {
            this.smartRoutingRequest = smartRoutingRequest;
            return this;
        }
        public String getSmartRoutingRequest() {
            return this.smartRoutingRequest;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setStaticRequest(String staticRequest) {
            this.staticRequest = staticRequest;
            return this;
        }
        public String getStaticRequest() {
            return this.staticRequest;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setSubscribeType(String subscribeType) {
            this.subscribeType = subscribeType;
            return this;
        }
        public String getSubscribeType() {
            return this.subscribeType;
        }

    }

}
