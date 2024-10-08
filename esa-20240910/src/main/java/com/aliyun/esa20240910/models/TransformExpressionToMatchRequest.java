// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TransformExpressionToMatchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Expression")
    public String expression;

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

    public static TransformExpressionToMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        TransformExpressionToMatchRequest self = new TransformExpressionToMatchRequest();
        return TeaModel.build(map, self);
    }

    public TransformExpressionToMatchRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public TransformExpressionToMatchRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public TransformExpressionToMatchRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
