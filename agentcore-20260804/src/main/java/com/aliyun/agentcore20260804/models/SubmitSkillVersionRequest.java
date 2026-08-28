// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SubmitSkillVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public SubmitSkillVersionRequestBody body;

    public static SubmitSkillVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSkillVersionRequest self = new SubmitSkillVersionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSkillVersionRequest setBody(SubmitSkillVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public SubmitSkillVersionRequestBody getBody() {
        return this.body;
    }

    public static class SubmitSkillVersionRequestBody extends TeaModel {
        public static SubmitSkillVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SubmitSkillVersionRequestBody self = new SubmitSkillVersionRequestBody();
            return TeaModel.build(map, self);
        }

    }

}
