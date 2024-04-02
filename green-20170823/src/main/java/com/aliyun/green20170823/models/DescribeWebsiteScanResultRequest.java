// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HandleStatus")
    public String handleStatus;

    @NameInMap("Label")
    public String label;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SiteUrl")
    public String siteUrl;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SubServiceModule")
    public String subServiceModule;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebsiteScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultRequest self = new DescribeWebsiteScanResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWebsiteScanResultRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebsiteScanResultRequest setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public String getHandleStatus() {
        return this.handleStatus;
    }

    public DescribeWebsiteScanResultRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public DescribeWebsiteScanResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebsiteScanResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebsiteScanResultRequest setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }
    public String getSiteUrl() {
        return this.siteUrl;
    }

    public DescribeWebsiteScanResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWebsiteScanResultRequest setSubServiceModule(String subServiceModule) {
        this.subServiceModule = subServiceModule;
        return this;
    }
    public String getSubServiceModule() {
        return this.subServiceModule;
    }

    public DescribeWebsiteScanResultRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
