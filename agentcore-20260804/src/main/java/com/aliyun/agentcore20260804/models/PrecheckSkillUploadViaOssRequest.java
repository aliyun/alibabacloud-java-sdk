// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrecheckSkillUploadViaOssRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public PrecheckSkillUploadViaOssRequestBody body;

    public static PrecheckSkillUploadViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckSkillUploadViaOssRequest self = new PrecheckSkillUploadViaOssRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckSkillUploadViaOssRequest setBody(PrecheckSkillUploadViaOssRequestBody body) {
        this.body = body;
        return this;
    }
    public PrecheckSkillUploadViaOssRequestBody getBody() {
        return this.body;
    }

    public static class PrecheckSkillUploadViaOssRequestBody extends TeaModel {
        /**
         * <p>The OSS object name (path).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skill/import/user123/ns-123456/2026/04/20/uuid/skills.zip</p>
         */
        @NameInMap("ossObjectName")
        public String ossObjectName;

        public static PrecheckSkillUploadViaOssRequestBody build(java.util.Map<String, ?> map) throws Exception {
            PrecheckSkillUploadViaOssRequestBody self = new PrecheckSkillUploadViaOssRequestBody();
            return TeaModel.build(map, self);
        }

        public PrecheckSkillUploadViaOssRequestBody setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

    }

}
