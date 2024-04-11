// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).</p>
     * <br>
     * <p>> If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
     * <br>
     * <p>*   **2**: Popular URLs by Request</p>
     * <p>*   **4**: Popular URLs by Traffic</p>
     * <p>*   **6**: Popular Referer by Request</p>
     * <p>*   **8**: Popular Referer by Traffic</p>
     * <p>*   **10**: Popular Back-to-origin URLs by Request</p>
     * <p>*   **12**: Popular Back-to-origin URLs by Traffic</p>
     * <p>*   **14**: Top Client IPs by Request</p>
     * <p>*   **16**: Top Client IPs by Traffic</p>
     * <p>*   **18**: Popular Domain Names by Traffic</p>
     * <p>*   **20**: PV/UV</p>
     * <p>*   **22**: Visit Distribution by Region</p>
     * <p>*   **24**: Distribution of ISPs</p>
     * <p>*   **26**: Peak IPv4/IPv6 Bandwidth</p>
     * <p>*   **27**: Back-to-origin bandwidth</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    public static CreateDcdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSubTaskRequest self = new CreateDcdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

}
