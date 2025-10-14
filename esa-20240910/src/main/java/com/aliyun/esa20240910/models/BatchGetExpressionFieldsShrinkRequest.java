// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchGetExpressionFieldsShrinkRequest extends TeaModel {
    /**
     * <p>List of expressions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Expressions")
    public String expressionsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Kind")
    public String kind;

    /**
     * <p>WAF Phase</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    @NameInMap("PlanNameEn")
    public String planNameEn;

    /**
     * <p>Site ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static BatchGetExpressionFieldsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetExpressionFieldsShrinkRequest self = new BatchGetExpressionFieldsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetExpressionFieldsShrinkRequest setExpressionsShrink(String expressionsShrink) {
        this.expressionsShrink = expressionsShrink;
        return this;
    }
    public String getExpressionsShrink() {
        return this.expressionsShrink;
    }

    public BatchGetExpressionFieldsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetExpressionFieldsShrinkRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public BatchGetExpressionFieldsShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchGetExpressionFieldsShrinkRequest setPlanNameEn(String planNameEn) {
        this.planNameEn = planNameEn;
        return this;
    }
    public String getPlanNameEn() {
        return this.planNameEn;
    }

    public BatchGetExpressionFieldsShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
