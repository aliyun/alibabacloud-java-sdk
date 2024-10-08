// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafBatchRuleShared extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Actions")
    public WafBatchRuleSharedActions actions;

    @NameInMap("CrossSiteId")
    public Long crossSiteId;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Match")
    public WafRuleMatch2 match;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Name")
    public String name;

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
        @NameInMap("Code")
        public Integer code;

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
