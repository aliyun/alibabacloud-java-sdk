// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasWithUsageRequest extends TeaModel {
    /**
     * <p>The plan ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quota names in the plan. Separate the quota names with commas (,). You can query up to 10 quota names at a time. Valid values:</p>
     * <ul>
     * <li><strong>customHttpCert</strong>: the custom certificates.</li>
     * <li><strong>transition_rule</strong>: the transform rules.</li>
     * <li><strong>waiting_room</strong>: the waiting rooms.</li>
     * <li><strong>https|rule_quota</strong>: the SSL/TLS rules.</li>
     * <li><strong>cache_rules|rule_quota</strong>: the cache rules.</li>
     * <li><strong>configuration_rules|rule_quota</strong>: the configuration rules.</li>
     * <li><strong>redirect_rules|rule_quota</strong>: the redirect rules.</li>
     * <li><strong>compression_rules|rule_quota</strong>: the compression rules.</li>
     * <li><strong>origin_rules|rule_quota</strong>: the origin rules.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customHttpCert</p>
     */
    @NameInMap("QuotaNames")
    public String quotaNames;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1232223****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListInstanceQuotasWithUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasWithUsageRequest self = new ListInstanceQuotasWithUsageRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasWithUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasWithUsageRequest setQuotaNames(String quotaNames) {
        this.quotaNames = quotaNames;
        return this;
    }
    public String getQuotaNames() {
        return this.quotaNames;
    }

    public ListInstanceQuotasWithUsageRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
