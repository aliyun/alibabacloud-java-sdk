// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ValidateAgentCodePackageFromOssRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ValidateAgentCodePackageFromOssRequestBody body;

    public static ValidateAgentCodePackageFromOssRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateAgentCodePackageFromOssRequest self = new ValidateAgentCodePackageFromOssRequest();
        return TeaModel.build(map, self);
    }

    public ValidateAgentCodePackageFromOssRequest setBody(ValidateAgentCodePackageFromOssRequestBody body) {
        this.body = body;
        return this;
    }
    public ValidateAgentCodePackageFromOssRequestBody getBody() {
        return this.body;
    }

    public static class ValidateAgentCodePackageFromOssRequestBody extends TeaModel {
        /**
         * <p>The name of the source OSS bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-bucket</p>
         */
        @NameInMap("ossBucketName")
        public String ossBucketName;

        /**
         * <p>The full object key of the source code package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>packages/main.zip</p>
         */
        @NameInMap("ossObjectName")
        public String ossObjectName;

        public static ValidateAgentCodePackageFromOssRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ValidateAgentCodePackageFromOssRequestBody self = new ValidateAgentCodePackageFromOssRequestBody();
            return TeaModel.build(map, self);
        }

        public ValidateAgentCodePackageFromOssRequestBody setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public ValidateAgentCodePackageFromOssRequestBody setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

    }

}
