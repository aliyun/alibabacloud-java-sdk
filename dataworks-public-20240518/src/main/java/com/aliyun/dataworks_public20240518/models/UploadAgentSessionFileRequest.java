// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadAgentSessionFileRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation identifier for the current request. The Id in the response returns this value as is to correlate the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>attachment-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. The example uses 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The parameter object for the upload stage. The prepare step issues the upload URL, and the complete step confirms that the file has been written to the target session instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public UploadAgentSessionFileRequestParams params;

    public static UploadAgentSessionFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSessionFileRequest self = new UploadAgentSessionFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadAgentSessionFileRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UploadAgentSessionFileRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public UploadAgentSessionFileRequest setParams(UploadAgentSessionFileRequestParams params) {
        this.params = params;
        return this;
    }
    public UploadAgentSessionFileRequestParams getParams() {
        return this.params;
    }

    public static class UploadAgentSessionFileRequestParams extends TeaModel {
        /**
         * <p>The MD5 hash of the original bytes in 32-character lowercase hexadecimal format. This parameter is required for both prepare and complete, and the values must be consistent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b1946ac92492d2347c6235b4d2611184</p>
         */
        @NameInMap("ContentMd5")
        public String contentMd5;

        /**
         * <p>The original file name. The maximum length is 255 bytes in UTF-8 encoding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample.csv</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the target agent session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The number of original bytes. Valid values: 1 to 10485760 (10 MiB). This parameter is required for both prepare and complete, and the values must be consistent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The upload identifier returned by prepare. This parameter is required when UploadMode is set to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        /**
         * <p>The required upload stage. The prepare step issues a public OSS PUT URL without starting a cold session instance. The complete step resumes the session and allows the runtime to download the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prepare</p>
         */
        @NameInMap("UploadMode")
        public String uploadMode;

        public static UploadAgentSessionFileRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSessionFileRequestParams self = new UploadAgentSessionFileRequestParams();
            return TeaModel.build(map, self);
        }

        public UploadAgentSessionFileRequestParams setContentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }
        public String getContentMd5() {
            return this.contentMd5;
        }

        public UploadAgentSessionFileRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UploadAgentSessionFileRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UploadAgentSessionFileRequestParams setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public UploadAgentSessionFileRequestParams setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public UploadAgentSessionFileRequestParams setUploadMode(String uploadMode) {
            this.uploadMode = uploadMode;
            return this;
        }
        public String getUploadMode() {
            return this.uploadMode;
        }

    }

}
