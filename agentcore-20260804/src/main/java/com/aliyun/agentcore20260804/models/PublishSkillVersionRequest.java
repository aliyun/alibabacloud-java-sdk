// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PublishSkillVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public PublishSkillVersionRequestBody body;

    public static PublishSkillVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishSkillVersionRequest self = new PublishSkillVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishSkillVersionRequest setBody(PublishSkillVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public PublishSkillVersionRequestBody getBody() {
        return this.body;
    }

    public static class PublishSkillVersionRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to update the latest label.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("updateLatestLabel")
        public Boolean updateLatestLabel;

        public static PublishSkillVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            PublishSkillVersionRequestBody self = new PublishSkillVersionRequestBody();
            return TeaModel.build(map, self);
        }

        public PublishSkillVersionRequestBody setUpdateLatestLabel(Boolean updateLatestLabel) {
            this.updateLatestLabel = updateLatestLabel;
            return this;
        }
        public Boolean getUpdateLatestLabel() {
            return this.updateLatestLabel;
        }

    }

}
