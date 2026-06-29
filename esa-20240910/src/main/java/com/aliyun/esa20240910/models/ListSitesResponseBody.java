// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of sites displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of queried site information.</p>
     */
    @NameInMap("Sites")
    public java.util.List<ListSitesResponseBodySites> sites;

    /**
     * <p>The total number of sites.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSitesResponseBody self = new ListSitesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSitesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSitesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSitesResponseBody setSites(java.util.List<ListSitesResponseBodySites> sites) {
        this.sites = sites;
        return this;
    }
    public java.util.List<ListSitesResponseBodySites> getSites() {
        return this.sites;
    }

    public ListSitesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSitesResponseBodySites extends TeaModel {
        /**
         * <p>The site access type. Valid values:</p>
         * <ul>
         * <li><strong>NS</strong>: NS-based access.</li>
         * <li><strong>CNAME</strong>: CNAME-based access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NS</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The CNAME suffix of the site. For sites that use CNAME-based access, this is the CNAME suffix that needs to be configured for records.</p>
         * 
         * <strong>example:</strong>
         * <p>example.cname.com</p>
         */
        @NameInMap("CnameZone")
        public String cnameZone;

        /**
         * <p>The acceleration region of the site. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland only.</li>
         * <li><strong>global</strong>: global.</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The creation time of the site. The time is in ISO 8601 format and displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID of the plan attached to the site.</p>
         * 
         * <strong>example:</strong>
         * <p>onBvtlmIyeXLbiDw81F9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of name servers assigned to the site. Multiple values are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
         */
        @NameInMap("NameServerList")
        public String nameServerList;

        /**
         * <p>The reason why the site is disabled. Valid values:</p>
         * <ul>
         * <li><strong>expiration_ arrears</strong>: The subscription plan has expired or the account has an overdue payment.</li>
         * <li><strong>internally_disabled</strong>: The site is disabled by the system.</li>
         * <li><strong>missing_icp</strong>: The domain name does not have an ICP filing.</li>
         * <li><strong>content_violation</strong>: Content violation.</li>
         * <li><strong>proactively_disabled</strong>: You proactively disabled the site or the site is disabled because the usage cap you configured is reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>expiration_ arrears</p>
         */
        @NameInMap("OfflineReason")
        public String offlineReason;

        /**
         * <p>The plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-168656498****</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The specification name of the site plan.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanSpecName")
        public String planSpecName;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek26g6i6se6pna</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
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
         * <li><strong>pending</strong>: the site is pending configuration.</li>
         * <li><strong>active</strong>: the site is activated.</li>
         * <li><strong>offline</strong>: the site is offline.</li>
         * <li><strong>moved</strong>: the site has been superseded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The site tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The update time of the site. The time is in ISO 8601 format and displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The site ownership verification code. When a site uses CNAME-based access, this TXT verification code must be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
         */
        @NameInMap("VerifyCode")
        public String verifyCode;

        /**
         * <p>The access time of the site. The time is in ISO 8601 format and displayed in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("VisitTime")
        public String visitTime;

        public static ListSitesResponseBodySites build(java.util.Map<String, ?> map) throws Exception {
            ListSitesResponseBodySites self = new ListSitesResponseBodySites();
            return TeaModel.build(map, self);
        }

        public ListSitesResponseBodySites setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListSitesResponseBodySites setCnameZone(String cnameZone) {
            this.cnameZone = cnameZone;
            return this;
        }
        public String getCnameZone() {
            return this.cnameZone;
        }

        public ListSitesResponseBodySites setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public ListSitesResponseBodySites setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSitesResponseBodySites setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSitesResponseBodySites setNameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
            return this;
        }
        public String getNameServerList() {
            return this.nameServerList;
        }

        public ListSitesResponseBodySites setOfflineReason(String offlineReason) {
            this.offlineReason = offlineReason;
            return this;
        }
        public String getOfflineReason() {
            return this.offlineReason;
        }

        public ListSitesResponseBodySites setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListSitesResponseBodySites setPlanSpecName(String planSpecName) {
            this.planSpecName = planSpecName;
            return this;
        }
        public String getPlanSpecName() {
            return this.planSpecName;
        }

        public ListSitesResponseBodySites setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSitesResponseBodySites setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListSitesResponseBodySites setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListSitesResponseBodySites setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSitesResponseBodySites setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListSitesResponseBodySites setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSitesResponseBodySites setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public ListSitesResponseBodySites setVisitTime(String visitTime) {
            this.visitTime = visitTime;
            return this;
        }
        public String getVisitTime() {
            return this.visitTime;
        }

    }

}
