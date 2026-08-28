// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RedraftSkillVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public RedraftSkillVersionRequestBody body;

    public static RedraftSkillVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        RedraftSkillVersionRequest self = new RedraftSkillVersionRequest();
        return TeaModel.build(map, self);
    }

    public RedraftSkillVersionRequest setBody(RedraftSkillVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public RedraftSkillVersionRequestBody getBody() {
        return this.body;
    }

    public static class RedraftSkillVersionRequestBody extends TeaModel {
        public static RedraftSkillVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            RedraftSkillVersionRequestBody self = new RedraftSkillVersionRequestBody();
            return TeaModel.build(map, self);
        }

    }

}
