// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafFilterRequest extends TeaModel {
    /**
     * <p>The WAF phase. Specifies the WAF phase for which to query the match engine information.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
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

    /**
     * <p>The target. Defines the application target of the match engine.</p>
     * 
     * <strong>example:</strong>
     * <p>characteristics</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom_cc</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetWafFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWafFilterRequest self = new GetWafFilterRequest();
        return TeaModel.build(map, self);
    }

    public GetWafFilterRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafFilterRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetWafFilterRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public GetWafFilterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
