// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names to be tracked. Separate multiple domain names with commas (,). You can specify up to 500 domain names. If you want to specify more than 500 domain names, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</p>
     * <blockquote>
     * <p>If you do not specify a domain name, the custom operations report is created for all domain names that belong to your Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example1.com,www.example2.com">www.example1.com,www.example2.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The IDs of the metrics that you want to include in the report. Separate multiple IDs with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: frequently requested URLs (ranked by the number of requests)</li>
     * <li><strong>3</strong>: frequently requested URLs (ranked by the amount of network traffic)</li>
     * <li><strong>5</strong>: frequently used Referer headers (ranked by the number of requests)</li>
     * <li><strong>7</strong>: frequently used Referer headers (ranked by the amount of network traffic)</li>
     * <li><strong>9</strong>: frequently requested URLs that are redirected to the origin (ranked by the number of requests)</li>
     * <li><strong>11</strong>: frequently requested URLs that are redirected to the origin (ranked by the amount of network traffic)</li>
     * <li><strong>13</strong>: top client IP addresses (ranked by the number of requests)</li>
     * <li><strong>15</strong>: top client IP addresses (ranked by the amount of network traffic)</li>
     * <li><strong>17</strong>: domain names ranked by the amount of network traffic</li>
     * <li><strong>19</strong>: page views and unique visitors</li>
     * <li><strong>21</strong>: regions from which requests are initiated</li>
     * <li><strong>23</strong>: Internet service providers (ISPs)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5</p>
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
