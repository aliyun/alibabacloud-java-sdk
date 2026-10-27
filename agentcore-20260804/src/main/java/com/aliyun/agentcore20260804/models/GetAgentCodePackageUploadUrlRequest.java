// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageUploadUrlRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public GetAgentCodePackageUploadUrlRequestBody body;

    public static GetAgentCodePackageUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageUploadUrlRequest self = new GetAgentCodePackageUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageUploadUrlRequest setBody(GetAgentCodePackageUploadUrlRequestBody body) {
        this.body = body;
        return this;
    }
    public GetAgentCodePackageUploadUrlRequestBody getBody() {
        return this.body;
    }

    public static class GetAgentCodePackageUploadUrlRequestBody extends TeaModel {
        /**
         * <p>The filename of the code package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>main.zip</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The declared compressed size of the code package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The format of the code package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        @NameInMap("format")
        public String format;

        public static GetAgentCodePackageUploadUrlRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetAgentCodePackageUploadUrlRequestBody self = new GetAgentCodePackageUploadUrlRequestBody();
            return TeaModel.build(map, self);
        }

        public GetAgentCodePackageUploadUrlRequestBody setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetAgentCodePackageUploadUrlRequestBody setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetAgentCodePackageUploadUrlRequestBody setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

}
