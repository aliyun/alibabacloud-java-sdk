// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskRequest extends TeaModel {
    // The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).
    // 
    // >  If you do not specify a domain name, the custom operations reports are created for all domain names that belong to your Alibaba Cloud account.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:
    // 
    // *   **1**: frequently requested URLs (ranked by the number of requests)
    // *   **3**: frequently requested URLs (ranked by the amount of network traffic)
    // *   **5**: frequently used referer headers (ranked by the number of requests)
    // *   **7**: frequently used referer headers (ranked by the amount of network traffic)
    // *   **9**: frequently requested back-to-origin URLs (ranked by the number of requests)
    // *   **11**: frequently requested back-to-origin URLs (ranked by the amount of network traffic)
    // *   **13**: top client IP addresses (ranked by the number of requests)
    // *   **15**: top client IP addresses (ranked by the amount of network traffic)
    // *   **17**: domain names ranked by the amount of network traffic
    // *   **19**: page views and unique visitors
    // *   **21**: regions from which requests are initiated
    // *   **23**: distribution of Internet service providers (ISPs)
    @NameInMap("ReportIds")
    public String reportIds;

    public static CreateCdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnSubTaskRequest self = new CreateCdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCdnSubTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

}
