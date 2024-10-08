// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
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
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
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
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <strong>example:</strong>
         * <p>domestic,overseas</p>
         */
        @NameInMap("Coverages")
        public String coverages;

        /**
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        @NameInMap("Sites")
        public java.util.List<ListUserRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

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

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
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

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
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

        public ListUserRatePlanInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
