// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafBatchRuleShared extends TeaModel {
    /**
     * <p>The action that you want WAF to perform on requests that match the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The extended action configurations.</p>
     */
    @NameInMap("Actions")
    public WafBatchRuleSharedActions actions;

    /**
     * <p>Specifies the cross-domain website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("CrossSiteId")
    public Long crossSiteId;

    /**
     * <p>The expression.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src eq 1.1.1.1</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The matching rule.</p>
     */
    @NameInMap("Match")
    public WafRuleMatch2 match;

    /**
     * <p>Web SDK integration method: automatic integration (automatic) or manual integration (manual).</p>
     * 
     * <strong>example:</strong>
     * <p>automatic</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ruleset name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Protection type: web or app.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("Target")
    public String target;

    public static WafBatchRuleShared build(java.util.Map<String, ?> map) throws Exception {
        WafBatchRuleShared self = new WafBatchRuleShared();
        return TeaModel.build(map, self);
    }

    public WafBatchRuleShared setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public WafBatchRuleShared setActions(WafBatchRuleSharedActions actions) {
        this.actions = actions;
        return this;
    }
    public WafBatchRuleSharedActions getActions() {
        return this.actions;
    }

    public WafBatchRuleShared setCrossSiteId(Long crossSiteId) {
        this.crossSiteId = crossSiteId;
        return this;
    }
    public Long getCrossSiteId() {
        return this.crossSiteId;
    }

    public WafBatchRuleShared setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public WafBatchRuleShared setMatch(WafRuleMatch2 match) {
        this.match = match;
        return this;
    }
    public WafRuleMatch2 getMatch() {
        return this.match;
    }

    public WafBatchRuleShared setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public WafBatchRuleShared setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WafBatchRuleShared setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public static class WafBatchRuleSharedActionsResponse extends TeaModel {
        /**
         * <p>The custom response code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The ID of the custom response page.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        @NameInMap("Id")
        public Long id;

        public static WafBatchRuleSharedActionsResponse build(java.util.Map<String, ?> map) throws Exception {
            WafBatchRuleSharedActionsResponse self = new WafBatchRuleSharedActionsResponse();
            return TeaModel.build(map, self);
        }

        public WafBatchRuleSharedActionsResponse setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public WafBatchRuleSharedActionsResponse setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class WafBatchRuleSharedActions extends TeaModel {
        /**
         * <p>The custom response.</p>
         */
        @NameInMap("Response")
        public WafBatchRuleSharedActionsResponse response;

        public static WafBatchRuleSharedActions build(java.util.Map<String, ?> map) throws Exception {
            WafBatchRuleSharedActions self = new WafBatchRuleSharedActions();
            return TeaModel.build(map, self);
        }

        public WafBatchRuleSharedActions setResponse(WafBatchRuleSharedActionsResponse response) {
            this.response = response;
            return this;
        }
        public WafBatchRuleSharedActionsResponse getResponse() {
            return this.response;
        }

    }

}
