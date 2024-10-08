// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformMatchToExpressionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Match")
    public String matchShrink;

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

    public static TransformMatchToExpressionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformMatchToExpressionShrinkRequest self = new TransformMatchToExpressionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TransformMatchToExpressionShrinkRequest setMatchShrink(String matchShrink) {
        this.matchShrink = matchShrink;
        return this;
    }
    public String getMatchShrink() {
        return this.matchShrink;
    }

    public TransformMatchToExpressionShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TransformMatchToExpressionShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
