// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateSkillLabelsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateSkillLabelsRequestBody body;

    public static UpdateSkillLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillLabelsRequest self = new UpdateSkillLabelsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillLabelsRequest setBody(UpdateSkillLabelsRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillLabelsRequestBody getBody() {
        return this.body;
    }

    public static class UpdateSkillLabelsRequestBody extends TeaModel {
        /**
         * <p>The version label mapping JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;latest&quot;:&quot;0.0.2&quot;,&quot;stable&quot;:&quot;0.0.1&quot;}</p>
         */
        @NameInMap("labels")
        public String labels;

        public static UpdateSkillLabelsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateSkillLabelsRequestBody self = new UpdateSkillLabelsRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateSkillLabelsRequestBody setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

    }

}
