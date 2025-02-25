// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesResponseBody extends TeaModel {
    /**
     * <p>Page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of sites per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of queried site information.</p>
     */
    @NameInMap("Sites")
    public java.util.List<ListSitesResponseBodySites> sites;

    /**
     * <p>Total number of sites.</p>
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
         * <p>Site access type. Values:</p>
         * <ul>
         * <li><strong>NS</strong>: Access through NS.</li>
         * <li><strong>CNAME</strong>: Access through CNAME.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NS</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>CNAME suffix of the site. For sites accessed via CNAME, this is the CNAME suffix that needs to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>example.cname.com</p>
         */
        @NameInMap("CnameZone")
        public String cnameZone;

        /**
         * <p>Site acceleration region. Values:</p>
         * <ul>
         * <li><strong>domestic</strong>: China mainland only.</li>
         * <li><strong>global</strong>: Global.</li>
         * <li><strong>overseas</strong>: Global (excluding China mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>Site creation time, in ISO8601 format and using UTC time, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the plan instance bound to the site.</p>
         * 
         * <strong>example:</strong>
         * <p>onBvtlmIyeXLbiDw81F9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of NS (Name Servers) assigned to the site. Separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
         */
        @NameInMap("NameServerList")
        public String nameServerList;

        @NameInMap("OfflineReason")
        public String offlineReason;

        /**
         * <p>The name of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-168656498****</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The specification name of the site\&quot;s plan.</p>
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
         * <p>The name of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The status of the site. Possible values:</p>
         * <ul>
         * <li><strong>pending</strong>: The site is pending configuration.</li>
         * <li><strong>active</strong>: The site is active.</li>
         * <li><strong>offline</strong>: The site is offline.</li>
         * <li><strong>moved</strong>: The site has been replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The update time of the site, represented in ISO8601 format and using UTC, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The verification code for site ownership. When the site is accessed via CNAME, this TXT verification code needs to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
         */
        @NameInMap("VerifyCode")
        public String verifyCode;

        /**
         * <p>The visit time of the site, formatted according to ISO8601 and using UTC, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
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
