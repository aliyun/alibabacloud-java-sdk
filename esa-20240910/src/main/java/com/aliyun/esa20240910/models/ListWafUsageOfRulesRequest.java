// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafUsageOfRulesRequest extends TeaModel {
    /**
     * <p>The WAF instance ID.</p>
     * <p>If this parameter is left empty, the API returns an empty result. We recommend that you always specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-b0wdsrlba3nk</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The phase in which the WAF rule runs. This parameter is required.</p>
     * <p>Common values: http_custom, http_ratelimit, http_anti_scan, http_bot, http_managed, http_whitelist, and http_threat_intelligence.</p>
     * <blockquote>
     * <p>Note: This parameter is required on the server side. If this parameter is not specified, the API returns InvalidParameter (400).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafUsageOfRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafUsageOfRulesRequest self = new ListWafUsageOfRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWafUsageOfRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWafUsageOfRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafUsageOfRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
