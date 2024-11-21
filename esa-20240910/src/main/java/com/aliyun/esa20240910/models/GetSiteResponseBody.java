// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried website information.</p>
     */
    @NameInMap("SiteModel")
    public GetSiteResponseBodySiteModel siteModel;

    public static GetSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteResponseBody self = new GetSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteResponseBody setSiteModel(GetSiteResponseBodySiteModel siteModel) {
        this.siteModel = siteModel;
        return this;
    }
    public GetSiteResponseBodySiteModel getSiteModel() {
        return this.siteModel;
    }

    public static class GetSiteResponseBodySiteModel extends TeaModel {
        /**
         * <p>The DNS setup option for the website. Valid values:</p>
         * <ul>
         * <li><strong>NS</strong></li>
         * <li><strong>CNAME</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NS</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The CNAME of the website domain. If you use CNAME setup when you add your website to ESA, the value is the CNAME that you configured then.</p>
         * 
         * <strong>example:</strong>
         * <p>example.cname.com</p>
         */
        @NameInMap("CnameZone")
        public String cnameZone;

        /**
         * <p>The service location. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland.</li>
         * <li><strong>global</strong>: global.</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The time when the WEBsite was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-merge-q6h0bv</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The nameservers assigned to the website domain. They are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>male1-1.ialicdn.com,female1-1.ialicdn.com</p>
         */
        @NameInMap("NameServerList")
        public String nameServerList;

        /**
         * <p>The plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-168777532****</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The specification of the plan associated with the website.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanSpecName")
        public String planSpecName;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek26g6i6se****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
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
         * <li><strong>pending</strong>: The website is to be configured.</li>
         * <li><strong>active</strong>: The website is active.</li>
         * <li><strong>offline</strong>: The website is suspended.</li>
         * <li><strong>moved</strong>: The website has been added and verified by another Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The time when the WEBsite was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The information about custom nameservers of the website domain. The key is a custom nameserver name, and the value is the IP address of the custom nameserver. Multiple IP addresses are separated by commas (,).</p>
         */
        @NameInMap("VanityNSList")
        public java.util.Map<String, String> vanityNSList;

        /**
         * <p>The code that is used to verify the website domain ownership. As part of the verification TXT record, this parameter is returned for websites that use CNAME setup.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
         */
        @NameInMap("VerifyCode")
        public String verifyCode;

        /**
         * <p>The status of version management. If true is returned, version management is enabled for the website.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VersionManagement")
        public Boolean versionManagement;

        public static GetSiteResponseBodySiteModel build(java.util.Map<String, ?> map) throws Exception {
            GetSiteResponseBodySiteModel self = new GetSiteResponseBodySiteModel();
            return TeaModel.build(map, self);
        }

        public GetSiteResponseBodySiteModel setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetSiteResponseBodySiteModel setCnameZone(String cnameZone) {
            this.cnameZone = cnameZone;
            return this;
        }
        public String getCnameZone() {
            return this.cnameZone;
        }

        public GetSiteResponseBodySiteModel setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public GetSiteResponseBodySiteModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSiteResponseBodySiteModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSiteResponseBodySiteModel setNameServerList(String nameServerList) {
            this.nameServerList = nameServerList;
            return this;
        }
        public String getNameServerList() {
            return this.nameServerList;
        }

        public GetSiteResponseBodySiteModel setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public GetSiteResponseBodySiteModel setPlanSpecName(String planSpecName) {
            this.planSpecName = planSpecName;
            return this;
        }
        public String getPlanSpecName() {
            return this.planSpecName;
        }

        public GetSiteResponseBodySiteModel setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSiteResponseBodySiteModel setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public GetSiteResponseBodySiteModel setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public GetSiteResponseBodySiteModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSiteResponseBodySiteModel setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetSiteResponseBodySiteModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetSiteResponseBodySiteModel setVanityNSList(java.util.Map<String, String> vanityNSList) {
            this.vanityNSList = vanityNSList;
            return this;
        }
        public java.util.Map<String, String> getVanityNSList() {
            return this.vanityNSList;
        }

        public GetSiteResponseBodySiteModel setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public GetSiteResponseBodySiteModel setVersionManagement(Boolean versionManagement) {
            this.versionManagement = versionManagement;
            return this;
        }
        public Boolean getVersionManagement() {
            return this.versionManagement;
        }

    }

}
