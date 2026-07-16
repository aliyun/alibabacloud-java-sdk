// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RecoverSiteResponseBody extends TeaModel {
    /**
     * <p>The access type. Valid values:</p>
     * <ul>
     * <li><p><strong>NS</strong>: access through NS hosting.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: access through CNAME.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The CNAME suffix of the site. For sites accessed through CNAME, this is the suffix that needs to be configured for the CNAME record.</p>
     * 
     * <strong>example:</strong>
     * <p>gf-test.hkrt.cn</p>
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
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The plan instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-9vjienwn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of name servers assigned to the site, separated by commas (,). When the site is accessed through NS, this field contains values. You need to change the DNS servers of the site to these name servers. Then you can verify site ownership and activate the site.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1.example.com,ns2.example.com</p>
     */
    @NameInMap("NameServerList")
    public String nameServerList;

    /**
     * <p>The reason why the site was disabled. Valid values:</p>
     * <ul>
     * <li><strong>expiration_ arrears</strong>: the subscription plan expired or the account has an overdue payment.</li>
     * <li><strong>internally_disabled</strong>: disabled by the system internally.</li>
     * <li><strong>missing_icp</strong>: the domain name lacks an ICP filing.</li>
     * <li><strong>content_violation</strong>: content violation.</li>
     * <li><strong>proactively_disabled</strong>: you proactively disabled the site or the site was disabled due to the usage cap you configured.</li>
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
     * <p>basic</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-axxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
     * <li><strong>pending</strong>: the site is pending configuration.</li>
     * <li><strong>active</strong>: the site is activated.</li>
     * <li><strong>offline</strong>: the site is offline.</li>
     * <li><strong>moved</strong>: the site has been superseded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-13T02:13:28Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The site ownership verification code. When the site is accessed through CNAME, this is the TXT verification code that needs to be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_d516cb3740f81f0cef77d162edd1****</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static RecoverSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverSiteResponseBody self = new RecoverSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverSiteResponseBody setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public RecoverSiteResponseBody setCnameZone(String cnameZone) {
        this.cnameZone = cnameZone;
        return this;
    }
    public String getCnameZone() {
        return this.cnameZone;
    }

    public RecoverSiteResponseBody setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public RecoverSiteResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public RecoverSiteResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RecoverSiteResponseBody setNameServerList(String nameServerList) {
        this.nameServerList = nameServerList;
        return this;
    }
    public String getNameServerList() {
        return this.nameServerList;
    }

    public RecoverSiteResponseBody setOfflineReason(String offlineReason) {
        this.offlineReason = offlineReason;
        return this;
    }
    public String getOfflineReason() {
        return this.offlineReason;
    }

    public RecoverSiteResponseBody setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public RecoverSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoverSiteResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RecoverSiteResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public RecoverSiteResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public RecoverSiteResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RecoverSiteResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public RecoverSiteResponseBody setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
