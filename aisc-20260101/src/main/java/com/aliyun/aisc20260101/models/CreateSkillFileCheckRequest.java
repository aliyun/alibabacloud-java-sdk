// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckRequest extends TeaModel {
    /**
     * <p>The file information.</p>
     */
    @NameInMap("Files")
    public java.util.List<CreateSkillFileCheckRequestFiles> files;

    /**
     * <p>The upload source. If left empty, the default value is user_upload. Use sec_ops_agent for the security operations agent.</p>
     * 
     * <strong>example:</strong>
     * <p>sec_ops_agent</p>
     */
    @NameInMap("Source")
    public String source;

    public static CreateSkillFileCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileCheckRequest self = new CreateSkillFileCheckRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileCheckRequest setFiles(java.util.List<CreateSkillFileCheckRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<CreateSkillFileCheckRequestFiles> getFiles() {
        return this.files;
    }

    public CreateSkillFileCheckRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public static class CreateSkillFileCheckRequestFiles extends TeaModel {
        /**
         * <p>The public URL for downloading the file. The downloaded file must be a compressed package in tar.gz or zip format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/xxxx">https://test.oss-cn-hangzhou.aliyuncs.com/xxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The file name. If not specified, the file name is parsed from DownloadUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>test-file</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The tenant-isolated OSS temporary object key returned by GenerateSkillOssUploadCredential. Specify either this parameter or DownloadUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>user-upload/staging/123456789/550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("UploadKey")
        public String uploadKey;

        public static CreateSkillFileCheckRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillFileCheckRequestFiles self = new CreateSkillFileCheckRequestFiles();
            return TeaModel.build(map, self);
        }

        public CreateSkillFileCheckRequestFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateSkillFileCheckRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateSkillFileCheckRequestFiles setUploadKey(String uploadKey) {
            this.uploadKey = uploadKey;
            return this;
        }
        public String getUploadKey() {
            return this.uploadKey;
        }

    }

}
