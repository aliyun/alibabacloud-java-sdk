// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateSkillBizTagsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateSkillBizTagsRequestBody body;

    public static UpdateSkillBizTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillBizTagsRequest self = new UpdateSkillBizTagsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillBizTagsRequest setBody(UpdateSkillBizTagsRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillBizTagsRequestBody getBody() {
        return this.body;
    }

    public static class UpdateSkillBizTagsRequestBody extends TeaModel {
        /**
         * <p>The business tags as a JSON array string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cs&quot;,&quot;qa&quot;,&quot;support&quot;]</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        public static UpdateSkillBizTagsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateSkillBizTagsRequestBody self = new UpdateSkillBizTagsRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateSkillBizTagsRequestBody setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

    }

}
