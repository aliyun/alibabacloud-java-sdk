// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformMatchToExpressionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Match")
    public WafRuleMatch match;

    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static TransformMatchToExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformMatchToExpressionRequest self = new TransformMatchToExpressionRequest();
        return TeaModel.build(map, self);
    }

    public TransformMatchToExpressionRequest setMatch(WafRuleMatch match) {
        this.match = match;
        return this;
    }
    public WafRuleMatch getMatch() {
        return this.match;
    }

    public TransformMatchToExpressionRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TransformMatchToExpressionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
