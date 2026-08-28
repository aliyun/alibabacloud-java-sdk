// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchUploadSkillsViaOssRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public BatchUploadSkillsViaOssRequestBody body;

    public static BatchUploadSkillsViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadSkillsViaOssRequest self = new BatchUploadSkillsViaOssRequest();
        return TeaModel.build(map, self);
    }

    public BatchUploadSkillsViaOssRequest setBody(BatchUploadSkillsViaOssRequestBody body) {
        this.body = body;
        return this;
    }
    public BatchUploadSkillsViaOssRequestBody getBody() {
        return this.body;
    }

    public static class BatchUploadSkillsViaOssRequestBody extends TeaModel {
        /**
         * <p>The OSS object name (path).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skill/import/user123/ns-123456/2026/04/20/uuid/skills.zip</p>
         */
        @NameInMap("ossObjectName")
        public String ossObjectName;

        /**
         * <p>Specifies whether to overwrite an existing Skill. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overwrite")
        public Boolean overwrite;

        public static BatchUploadSkillsViaOssRequestBody build(java.util.Map<String, ?> map) throws Exception {
            BatchUploadSkillsViaOssRequestBody self = new BatchUploadSkillsViaOssRequestBody();
            return TeaModel.build(map, self);
        }

        public BatchUploadSkillsViaOssRequestBody setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public BatchUploadSkillsViaOssRequestBody setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Boolean getOverwrite() {
            return this.overwrite;
        }

    }

}
