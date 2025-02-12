// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesResponseBody extends TeaModel {
    /**
     * <p>The queried plans.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The page number.</p>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
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
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The website status. Valid values:</p>
         * <ul>
         * <li>pending: The website is to be configured.</li>
         * <li>active: The website is active.</li>
         * <li>offline: The website is suspended.</li>
         * <li>moved: The website has been added and verified by another Alibaba Cloud account.</li>
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
         * <li>PREPAY: subscription.</li>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        @NameInMap("BotInstanceLevel")
        public String botInstanceLevel;

        @NameInMap("BotRequest")
        public String botRequest;

        /**
         * <p>The service locations for the websites that can be associated with the plan. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>domestic: the Chinese mainland.</li>
         * <li>overseas: outside the Chinese mainland.</li>
         * <li>global: global.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic,overseas</p>
         */
        @NameInMap("Coverages")
        public String coverages;

        /**
         * <p>The time when the plan was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CrossborderTraffic")
        public String crossborderTraffic;

        @NameInMap("DdosBurstableDomesticProtection")
        public String ddosBurstableDomesticProtection;

        @NameInMap("DdosBurstableOverseasProtection")
        public String ddosBurstableOverseasProtection;

        @NameInMap("DdosInstanceLevel")
        public String ddosInstanceLevel;

        /**
         * <p>The subscription duration of the plan. Unit: month.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EdgeRoutineRquest")
        public String edgeRoutineRquest;

        @NameInMap("EdgeWafRequest")
        public String edgeWafRequest;

        /**
         * <p>The time when the plan expires.</p>
         * 
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Layer4Traffic")
        public String layer4Traffic;

        @NameInMap("Layer4TrafficIntl")
        public String layer4TrafficIntl;

        /**
         * <p>The plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanTraffic")
        public String planTraffic;

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li>normal</li>
         * <li>enterprise</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The maximum number of websites that can be associated with the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        /**
         * <p>The websites that have been associated with the plan.</p>
         */
        @NameInMap("Sites")
        public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        @NameInMap("SmartRoutingRequest")
        public String smartRoutingRequest;

        @NameInMap("StaticRequest")
        public String staticRequest;

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
