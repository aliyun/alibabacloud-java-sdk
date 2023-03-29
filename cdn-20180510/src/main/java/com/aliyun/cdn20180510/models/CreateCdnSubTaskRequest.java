// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).</p>
     * <br>
     * <p>>  If you do not specify a domain name, the custom operations reports are created for all domain names that belong to your Alibaba Cloud account.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
     * <br>
     * <p>*   **1**: frequently requested URLs (ranked by the number of requests)</p>
     * <p>*   **3**: frequently requested URLs (ranked by the amount of network traffic)</p>
     * <p>*   **5**: frequently used referer headers (ranked by the number of requests)</p>
     * <p>*   **7**: frequently used referer headers (ranked by the amount of network traffic)</p>
     * <p>*   **9**: frequently requested back-to-origin URLs (ranked by the number of requests)</p>
     * <p>*   **11**: frequently requested back-to-origin URLs (ranked by the amount of network traffic)</p>
     * <p>*   **13**: top client IP addresses (ranked by the number of requests)</p>
     * <p>*   **15**: top client IP addresses (ranked by the amount of network traffic)</p>
     * <p>*   **17**: domain names ranked by the amount of network traffic</p>
     * <p>*   **19**: page views and unique visitors</p>
     * <p>*   **21**: regions from which requests are initiated</p>
     * <p>*   **23**: distribution of Internet service providers (ISPs)</p>
     */
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

    public CreateCdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

}
