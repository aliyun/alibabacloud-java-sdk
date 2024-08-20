// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
     * <blockquote>
     * <p>If you do not specify a domain name, the tracking task is created for all domain names that belong to your Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.org</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Popular URLs by Request</li>
     * <li><strong>4</strong>: Popular URLs by Traffic</li>
     * <li><strong>6</strong>: Popular Referer by Request</li>
     * <li><strong>8</strong>: Popular Referer by Traffic</li>
     * <li><strong>10</strong>: Popular Back-to-origin URLs by Request</li>
     * <li><strong>12</strong>: Popular Back-to-origin URLs by Traffic</li>
     * <li><strong>14</strong>: Top Client IPs by Request</li>
     * <li><strong>16</strong>: Top Client IPs by Traffic</li>
     * <li><strong>18</strong>: Popular Domain Names by Traffic</li>
     * <li><strong>20</strong>: PV/UV</li>
     * <li><strong>22</strong>: Visit Distribution by Region</li>
     * <li><strong>24</strong>: Distribution of ISPs</li>
     * <li><strong>26</strong>: Peak IPv4/IPv6 Bandwidth</li>
     * <li><strong>27</strong>: Back-to-origin bandwidth</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2,4,6</p>
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
