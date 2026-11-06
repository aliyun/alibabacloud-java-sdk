// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpCodePackageUploadUrlRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public GetMcpCodePackageUploadUrlRequestBody body;

    public static GetMcpCodePackageUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcpCodePackageUploadUrlRequest self = new GetMcpCodePackageUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMcpCodePackageUploadUrlRequest setBody(GetMcpCodePackageUploadUrlRequestBody body) {
        this.body = body;
        return this;
    }
    public GetMcpCodePackageUploadUrlRequestBody getBody() {
        return this.body;
    }

    public static class GetMcpCodePackageUploadUrlRequestBody extends TeaModel {
        /**
         * <p>The file name of the ZIP code package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>server.zip</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static GetMcpCodePackageUploadUrlRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetMcpCodePackageUploadUrlRequestBody self = new GetMcpCodePackageUploadUrlRequestBody();
            return TeaModel.build(map, self);
        }

        public GetMcpCodePackageUploadUrlRequestBody setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
