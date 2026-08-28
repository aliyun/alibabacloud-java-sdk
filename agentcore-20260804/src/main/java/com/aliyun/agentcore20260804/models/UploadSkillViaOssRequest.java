// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UploadSkillViaOssRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UploadSkillViaOssRequestBody body;

    public static UploadSkillViaOssRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSkillViaOssRequest self = new UploadSkillViaOssRequest();
        return TeaModel.build(map, self);
    }

    public UploadSkillViaOssRequest setBody(UploadSkillViaOssRequestBody body) {
        this.body = body;
        return this;
    }
    public UploadSkillViaOssRequestBody getBody() {
        return this.body;
    }

    public static class UploadSkillViaOssRequestBody extends TeaModel {
        /**
         * <p>The commit message. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Update documentation</p>
         */
        @NameInMap("commitMsg")
        public String commitMsg;

        /**
         * <p>The OSS object name (path).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imports/example.zip</p>
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

        /**
         * <p>The upload version number. This parameter is optional and used as a fallback when the ZIP package contains no version information.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        public static UploadSkillViaOssRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UploadSkillViaOssRequestBody self = new UploadSkillViaOssRequestBody();
            return TeaModel.build(map, self);
        }

        public UploadSkillViaOssRequestBody setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public UploadSkillViaOssRequestBody setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public UploadSkillViaOssRequestBody setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        public UploadSkillViaOssRequestBody setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

    }

}
