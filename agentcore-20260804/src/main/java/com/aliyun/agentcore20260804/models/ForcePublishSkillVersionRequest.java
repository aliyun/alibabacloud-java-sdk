// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ForcePublishSkillVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public ForcePublishSkillVersionRequestBody body;

    public static ForcePublishSkillVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ForcePublishSkillVersionRequest self = new ForcePublishSkillVersionRequest();
        return TeaModel.build(map, self);
    }

    public ForcePublishSkillVersionRequest setBody(ForcePublishSkillVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public ForcePublishSkillVersionRequestBody getBody() {
        return this.body;
    }

    public static class ForcePublishSkillVersionRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to update the latest label.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updateLatestLabel")
        public Boolean updateLatestLabel;

        public static ForcePublishSkillVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ForcePublishSkillVersionRequestBody self = new ForcePublishSkillVersionRequestBody();
            return TeaModel.build(map, self);
        }

        public ForcePublishSkillVersionRequestBody setUpdateLatestLabel(Boolean updateLatestLabel) {
            this.updateLatestLabel = updateLatestLabel;
            return this;
        }
        public Boolean getUpdateLatestLabel() {
            return this.updateLatestLabel;
        }

    }

}
