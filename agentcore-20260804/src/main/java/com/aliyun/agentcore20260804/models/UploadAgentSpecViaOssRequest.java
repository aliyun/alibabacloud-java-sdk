// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UploadAgentSpecViaOssRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UploadAgentSpecViaOssRequestBody body;

    public static UploadAgentSpecViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSpecViaOssRequest self = new UploadAgentSpecViaOssRequest();
        return TeaModel.build(map, self);
    }

    public UploadAgentSpecViaOssRequest setBody(UploadAgentSpecViaOssRequestBody body) {
        this.body = body;
        return this;
    }
    public UploadAgentSpecViaOssRequestBody getBody() {
        return this.body;
    }

    public static class UploadAgentSpecViaOssRequestBody extends TeaModel {
        /**
         * <p>The OSS object name (full path).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec/export/user1/ns1/2024-01-01/uuid/123456.zip</p>
         */
        @NameInMap("ossObjectName")
        public String ossObjectName;

        /**
         * <p>Specifies whether to overwrite existing drafts. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overwrite")
        public Boolean overwrite;

        /**
         * <p>Specifies whether to publish immediately after upload. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("publish")
        public Boolean publish;

        public static UploadAgentSpecViaOssRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSpecViaOssRequestBody self = new UploadAgentSpecViaOssRequestBody();
            return TeaModel.build(map, self);
        }

        public UploadAgentSpecViaOssRequestBody setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public UploadAgentSpecViaOssRequestBody setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        public UploadAgentSpecViaOssRequestBody setPublish(Boolean publish) {
            this.publish = publish;
            return this;
        }
        public Boolean getPublish() {
            return this.publish;
        }

    }

}
