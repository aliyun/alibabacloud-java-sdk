// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UploadDataSourceFileRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The request object for uploading a datasource authentication file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadCommand")
    public UploadDataSourceFileRequestUploadCommand uploadCommand;

    public static UploadDataSourceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSourceFileRequest self = new UploadDataSourceFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataSourceFileRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UploadDataSourceFileRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UploadDataSourceFileRequest setUploadCommand(UploadDataSourceFileRequestUploadCommand uploadCommand) {
        this.uploadCommand = uploadCommand;
        return this;
    }
    public UploadDataSourceFileRequestUploadCommand getUploadCommand() {
        return this.uploadCommand;
    }

    public static class UploadDataSourceFileRequestUploadCommand extends TeaModel {
        /**
         * <p>The Base64-encoded file content. The decoded file size must be between 0 and 5 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2V5dGFiIGNvbnRlbnQ=</p>
         */
        @NameInMap("FileContentBase64")
        public String fileContentBase64;

        /**
         * <p>The file name, including the extension. The extension is validated against a whitelist. Supported extensions: jar, xml, conf, keytab, jks, rsa, pem, yaml, keystore, properties, and key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user.keytab</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static UploadDataSourceFileRequestUploadCommand build(java.util.Map<String, ?> map) throws Exception {
            UploadDataSourceFileRequestUploadCommand self = new UploadDataSourceFileRequestUploadCommand();
            return TeaModel.build(map, self);
        }

        public UploadDataSourceFileRequestUploadCommand setFileContentBase64(String fileContentBase64) {
            this.fileContentBase64 = fileContentBase64;
            return this;
        }
        public String getFileContentBase64() {
            return this.fileContentBase64;
        }

        public UploadDataSourceFileRequestUploadCommand setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
