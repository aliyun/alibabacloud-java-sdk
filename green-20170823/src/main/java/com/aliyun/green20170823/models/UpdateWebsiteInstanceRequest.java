// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("IndexPage")
    public String indexPage;

    @NameInMap("IndexPageScanInterval")
    public Integer indexPageScanInterval;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SiteProtocol")
    public String siteProtocol;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("WebsiteScanInterval")
    public Integer websiteScanInterval;

    public static UpdateWebsiteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceRequest self = new UpdateWebsiteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateWebsiteInstanceRequest setIndexPage(String indexPage) {
        this.indexPage = indexPage;
        return this;
    }
    public String getIndexPage() {
        return this.indexPage;
    }

    public UpdateWebsiteInstanceRequest setIndexPageScanInterval(Integer indexPageScanInterval) {
        this.indexPageScanInterval = indexPageScanInterval;
        return this;
    }
    public Integer getIndexPageScanInterval() {
        return this.indexPageScanInterval;
    }

    public UpdateWebsiteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWebsiteInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateWebsiteInstanceRequest setSiteProtocol(String siteProtocol) {
        this.siteProtocol = siteProtocol;
        return this;
    }
    public String getSiteProtocol() {
        return this.siteProtocol;
    }

    public UpdateWebsiteInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateWebsiteInstanceRequest setWebsiteScanInterval(Integer websiteScanInterval) {
        this.websiteScanInterval = websiteScanInterval;
        return this;
    }
    public Integer getWebsiteScanInterval() {
        return this.websiteScanInterval;
    }

}
