// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateSkillScopeRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateSkillScopeRequestBody body;

    public static UpdateSkillScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillScopeRequest self = new UpdateSkillScopeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillScopeRequest setBody(UpdateSkillScopeRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillScopeRequestBody getBody() {
        return this.body;
    }

    public static class UpdateSkillScopeRequestBody extends TeaModel {
        /**
         * <p>The visibility scope.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("scope")
        public String scope;

        public static UpdateSkillScopeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateSkillScopeRequestBody self = new UpdateSkillScopeRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateSkillScopeRequestBody setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
